<template>
    <div>
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Bar Charts</h4>
            </div>
            <div class="card-body">
               <composite-chart></composite-chart>
            </div>
        </div>
        <!--default demo charts-->
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Default charts</h4>
            </div>
            <div class="card-body">
                <default-chart></default-chart>
            </div>
        </div>
        <div class="card">
            <div class="card-header">
                <h4 class="card-title">Plot Trends</h4>
            </div>
            <div class="card-body">
                <trend-chart></trend-chart>
            </div>
        </div>
    </div>
</template>
<script>
    import compositeChart from "components/plugins/frappe-charts/composite-chart"
    import defaultChart from "components/plugins/frappe-charts/default-charts"
    import trendChart from "components/plugins/frappe-charts/trend-chart"
    export default {
        name: "frappe-charts",
        data() {
            return {}
        },
        components:{
            compositeChart,
            defaultChart,
            trendChart,
        },
        mounted: function () {

        },
        methods: {
        },
        destroyed: function () {

        }
    }
</script>
