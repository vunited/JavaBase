<template>
    <div class="row">
        <div class="col-lg-12">
            <b-card header="Vue-Quill-Editor" header-tag="h4" class="bg-primary-card">
                <quill-editor :content="content" :options="quilleditorOption" ref="myTextEditor" @change="onEditorChange($event)" class="edi"></quill-editor>
            </b-card>
        </div>
        <div class="col-lg-12">
            <b-card header="Vue-Codemirror" header-tag="h4" class="bg-warning-card">
                <codemirror v-model="code" :options="editorOptions"></codemirror>
            </b-card>
        </div>
    </div>
</template>
<script>
import Vue from 'vue';
import VueQuillEditor from 'vue-quill-editor';
import VueCodeMirror from 'vue-codemirror';
import 'codemirror/keymap/sublime';
import 'codemirror/mode/javascript/javascript.js'

// require styles
import 'quill/dist/quill.core.css'
import 'quill/dist/quill.snow.css'
import 'quill/dist/quill.bubble.css'
import 'codemirror/lib/codemirror.css'
import 'codemirror/theme/monokai.css'

Vue.use(VueQuillEditor);
Vue.use(VueCodeMirror);
export default {
    name: "form_editors",
    data() {
        return {
            content: '<h2>Vue quill Editor</h2>',
            code: 'const a = 10',
            quilleditorOption: {
                // some quill options
            },
            editorOptions: {
                // codemirror options
                tabSize: 4,
                mode: 'text/javascript',
                theme: 'monokai',
                lineNumbers: true,
                line: true,
                keyMap: "sublime",
                extraKeys: {
                    "Ctrl": "autocomplete"
                },
                foldGutter: true,
                gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"],
                styleSelectedText: true,
                highlightSelectionMatches: {
                    showToken: /\w/,
                    annotateScrollbar: true
                }
            }
        }
    },
    methods: {
        onEditorChange({
            editor,
            html,
            text
        }) {
            this.content = html
        }
    }
}
</script>
<style>
    .ql-tooltip.ql-editing{
        z-index: 99;
    }
</style>
