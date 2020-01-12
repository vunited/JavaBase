<template>
    <chat :list="chat" class="chat"></chat>
</template>
<script>
    import Vue from "vue"
    import chat from "components/widgets/chat_component/chat-large.vue";
    import chat_data from "assets/js/chat_data";

    export default {
        // ===Component name
        name: "chat_page",
        // ===Props passed to component
        props: {},
        // ===Components used by this component
        components: {
            chat,
        },
        // ===component Data properties
        data() {
            return {
                chat: chat_data,
            }
        },
        // ===Code to be executed when Component is mounted
        mounted() {

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
<style lang="scss" scoped>
    .chat {
        min-height: calc(100vh - 140px);
        height: calc(100vh - 140px);
        overflow: auto;
    }
</style>
