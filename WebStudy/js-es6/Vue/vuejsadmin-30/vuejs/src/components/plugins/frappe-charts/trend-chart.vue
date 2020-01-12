<template>
    <div>
                        <div id="chart-trends" class="border"></div>
                <div class="btn-group chart-plot-buttons mt-1  mt-3" role="group">
                    <button type="button" class="btn btn-sm btn-primary" data-type="line">Line</button>
                    <button type="button" class="btn btn-sm btn-primary active" data-type="heatline">HeatLine</button>
                    <button type="button" class="btn btn-sm btn-primary" data-type="region">Region</button>
                </div>

    </div>
</template>
<script>
    import Chart from "frappe-charts/dist/frappe-charts.min.esm"

    export default {
        // ===Component name
        name: "blank",
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
            // Trends Chart
            // ================================================================================
            let trends_data = {
                labels: [1967, 1968, 1969, 1970, 1971, 1972, 1973, 1974, 1975, 1976,
                    1977, 1978, 1979, 1980, 1981, 1982, 1983, 1984, 1985, 1986,
                    1987, 1988, 1989, 1990, 1991, 1992, 1993, 1994, 1995, 1996,
                    1997, 1998, 1999, 2000, 2001, 2002, 2003, 2004, 2005, 2006,
                    2007, 2008, 2009, 2010, 2011, 2012, 2013, 2014, 2015, 2016
                ],
                datasets: [{
                    "values": [132.9, 150.0, 149.4, 148.0, 94.4, 97.6, 54.1, 49.2, 22.5, 18.4,
                        39.3, 131.0, 220.1, 218.9, 198.9, 162.4, 91.0, 60.5, 20.6, 14.8,
                        33.9, 123.0, 211.1, 191.8, 203.3, 133.0, 76.1, 44.9, 25.1, 11.6,
                        28.9, 88.3, 136.3, 173.9, 170.4, 163.6, 99.3, 65.3, 45.8, 24.7,
                        12.6, 4.2, 4.8, 24.9, 80.8, 84.5, 94.0, 113.3, 69.8, 39.8
                    ]
                }]
            };

            let plot_chart_args = {
                parent: "#chart-trends",
                title: "Mean Total Sunspot Count - Yearly",
                data: trends_data,
                type: 'line',
                height: 250,
                colors: ['#20c997'],
                is_series: 1,
                show_dots: 0,
                heatline: 1,
                x_axis_mode: 'tick',
                y_axis_mode: 'span'
            };

            new Chart(plot_chart_args);

            Array.prototype.slice.call(
                document.querySelectorAll('.chart-plot-buttons button')
            ).map(el => {
                el.addEventListener('click', (e) => {
                    let btn = e.target;
                    let type = btn.getAttribute('data-type');
                    let config = [];

                    if (type === 'line') {
                        config = [0, 0, 0];
                    } else if (type === 'region') {
                        config = [0, 0, 1];
                    } else {
                        config = [0, 1, 0];
                    }

                    plot_chart_args.show_dots = config[0];
                    plot_chart_args.heatline = config[1];
                    plot_chart_args.region_fill = config[2];

                    plot_chart_args.init = false;

                    new Chart(plot_chart_args);

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
