<template>
    <div>
        <div class="row">
            <div class="col-sm-6 push-sm-1 later" style="font-size: 14px;">
                <div id="chart-composite-1" class="border">
                    <svg height=225></svg>
                </div>
                <span class="mt-1">Click or use arrow keys to navigate data points</span>
            </div>
            <div class="col-sm-6 push-sm-1 later" style="font-size: 14px;">
                <div class="card-header">
                    <div id="chart-composite-2" class="border">
                        <svg height=225></svg>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import Chart from "frappe-charts/dist/frappe-charts.min.esm"
    export default {
        // ===Component name
        name: "composite",
        // ===Props passed to component
        props: {},
        // ===Components used by this component
        components: {

        },
        // ===component Data properties
        data() {
            return {

            }
        },
        // ===Code to be executed when Component is mounted
        mounted() {
            // Composite Chart
            // ================================================================================
            let report_count_list = [17, 40, 33, 44, 126, 156, 324, 333, 478, 495, 373];

            let bar_composite_data = {
                labels: ["2007", "2008", "2009", "2010", "2011", "2012",
                    "2013", "2014", "2015", "2016", "2017"
                ],
                datasets: [{
                    "title": "Events",
                    "values": report_count_list,
                    "formatted": report_count_list.map(d => d + " reports")
                }]
            };

            let line_composite_data = {
                labels: ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"],
                datasets: [{
                    "values": [36, 46, 45, 32, 27, 31, 30, 36, 39, 49, 0, 0],
                }]
            };

            let more_line_data = {
                // 0: {values: [4, 0, 3, 1, 1, 2, 1, 2, 1, 0, 1, 1]},
                0: {
                    values: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
                },
                1: {
                    values: [2, 3, 3, 2, 1, 4, 0, 1, 2, 7, 11, 4]
                },
                2: {
                    values: [7, 7, 2, 4, 0, 1, 5, 3, 1, 2, 0, 1]
                },
                3: {
                    values: [0, 2, 6, 2, 2, 1, 2, 3, 6, 3, 7, 10]
                },
                4: {
                    values: [9, 10, 8, 10, 6, 5, 8, 8, 24, 15, 10, 13]
                },
                5: {
                    values: [9, 13, 16, 9, 4, 5, 7, 10, 14, 22, 23, 24]
                },
                6: {
                    values: [20, 22, 28, 19, 28, 19, 14, 19, 51, 37, 29, 38]
                },
                7: {
                    values: [29, 20, 22, 16, 16, 19, 24, 26, 57, 31, 46, 27]
                },
                8: {
                    values: [36, 24, 38, 27, 15, 22, 24, 38, 32, 57, 139, 26]
                },
                9: {
                    values: [37, 36, 32, 33, 12, 34, 52, 45, 58, 57, 64, 35]
                },
                10: {
                    values: [36, 46, 45, 32, 27, 31, 30, 36, 39, 49, 0, 0]
                }
            };

            let c1 = document.querySelector("#chart-composite-1");
            let c2 = document.querySelector("#chart-composite-2");

            let bar_composite_chart = new Chart({
                parent: c1,
                title: "Fireball/Bolide Events - Yearly (more than 5 reports)",
                data: bar_composite_data,
                type: 'bar',
                height: 180,
                colors: ['#ff6666'],
                is_navigable: 1,
                is_series: 1,
                region_fill: 1
            });

            let line_composite_chart = new Chart({
                parent: c2,
                data: line_composite_data,
                type: 'line',
                height: 180,
                colors: ['#20c997'],
                is_series: 1
            });

            bar_composite_chart.parent.addEventListener('data-select', (e) => {
                line_composite_chart.update_values([more_line_data[e.index]]);
            });


        },
        // ===Computed properties for the component
        computed: {},
        // ===Component methods
        methods: {

        }
    }
</script>
<!-- styles -->
<!-- adding scoped attribute will apply the css to this component only -->
<style scoped></style>
