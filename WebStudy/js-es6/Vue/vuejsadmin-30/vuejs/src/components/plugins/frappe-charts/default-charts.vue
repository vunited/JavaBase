<template>
    <div>
        <div id="chart-types" class="border"></div>
                <div class="btn-group chart-type-buttons margin-vertical-px mt-3" role="group">
                    <button type="button" class="btn btn-sm btn-primary  p-1 p-sm-2" data-type='bar'>Bar</button>
                    <button type="button" class="btn btn-sm btn-primary p-1 p-sm-2" data-type='line'>Line</button>
                    <button type="button" class="btn btn-sm btn-primary p-1 p-sm-2" data-type='scatter'>Scatter</button>
                    <button type="button" class="btn btn-sm btn-primary p-1 p-sm-2" data-type='pie'>Pie</button>
                    <button type="button" class="btn btn-sm btn-primary p-1 p-sm-2" data-type='percentage'>Percentage</button>
                </div>
    </div>
</template>
<script>
    import Chart from "frappe-charts/dist/frappe-charts.min.esm"
    export default {
        // ===Component name
        name: "default-charts",
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
            // Demo Chart (bar, linepts, scatter(blobs), percentage)
            // ================================================================================
            let type_data = {
                labels: ["12am-3am", "3am-6am", "6am-9am", "9am-12pm",
                    "12pm-3pm", "3pm-6pm", "6pm-9pm", "9pm-12am"],

                datasets: [
                    {
                        title: "Some Data",
                        values: [25, 40, 30, 35, 8, 52, 17, -4]
                    },
                    {
                        title: "Another Set",
                        values: [25, 50, -10, 15, 18, 32, 27, 14]
                    },
                    {
                        title: "Yet Another",
                        values: [15, 20, -3, -15, 58, 12, -17, 37]
                    }
                ]
            };

            let type_chart = new Chart({
                parent: "#chart-types",
                title: "My Awesome Chart",
                data: type_data,
                type: 'pie',
                height: 250,
                colors: ['#20c997', '#fd7e14', '#66ccff'],
                is_series: 1,
                format_tooltip_x: d => (d + '').toUpperCase(),
                format_tooltip_y: d => d + ' pts'
            });

            Array.prototype.slice.call(
                document.querySelectorAll('.chart-type-buttons button')
            ).map(el => {
                el.addEventListener('click', (e) => {
                    let btn = e.target;
                    let type = btn.getAttribute('data-type');

                    let newChart = type_chart.get_different_chart(type);
//                    type_chart.colors=['#20c997', '#fd7e14', '#66ccff','#ccc','#ddd','#eee','#222','#111'];

                    if(newChart){
                        type_chart = newChart;
                    }

                    type_chart.setColors(['#20c997', '#fd7e14', '#66ccff'],type);
                    type_chart.refresh()
                    Array.prototype.slice.call(
                        btn.parentNode.querySelectorAll('button')).map(el => {
                        el.classList.remove('active');
                    });
                    btn.classList.add('active');
                });
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
