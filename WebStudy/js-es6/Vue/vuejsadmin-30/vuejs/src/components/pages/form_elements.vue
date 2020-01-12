<template>
    <div>
        <div class="row">
            <div class="col-lg-12">
                <b-card class="mb-2 bg-default-card" header="Form Elements" header-tag="h4">
                    <div>
                        <form method="" class="form-horizontal">
                            <div class="row">
                                <div class="col-md-6">
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="text">Text:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" id="text" placeholder="Some value">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="input_Email">Email:</label>
                                        <div class="col-md-9">
                                            <input type="email" class="form-control" id="input_Email" placeholder="Email">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="input_Password">Password:</label>
                                        <div class="col-md-9">
                                            <input type="password" class="form-control" id="input_Password" placeholder="Password">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="disabled">Disabled:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" id="disabled" placeholder="Disabled input" disabled>
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4">Readonly:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" id="text2" placeholder="Read only" readonly>
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="col-md-3 control-label" for="example-select">Select:</label>
                                        <div class="col-md-9">
                                            <select id="example-select" name="example-select" class="form-control" size="1">
                                                <option value="0">
                                                    Please select
                                                </option>
                                                <option value="1">Bootstrap</option>
                                                <option value="2">CSS</option>
                                                <option value="3">JavaScript</option>
                                                <option value="4">HTML</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="text_area">Text area:</label>
                                        <div class="col-md-9">
                                            <textarea rows="4" class="form-control resize_vertical" id="text_area" placeholder="Postal Address"></textarea>
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-5" for="maxlength">Maxlength:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="text" class="form-control" maxlength="5" id="maxlength" placeholder="Maxlength is five">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="color">Color:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="color" class="form-control" name="color" id="color" value="#428bca">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="range">Range:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="range" class="form-control" name="range" id="range" value="50">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="url">Url:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="url" class="form-control" name="url" value="http://www.example.com/" id="url">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="search">Search:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="search" class="form-control" id="search" placeholder="Search value">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="number">Number:
                                        </label>
                                        <div class="col-md-9">
                                            <input type="number" class="form-control" id="number" placeholder="Enter value">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-md-6">
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="date">Date:
                                        </label>
                                        <div class="col-md-8 col-md-offset-2">
                                            <input type="date" class="form-control" id="date" value="yyyy-mm-dd" aria-selected="true">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="time">Time:
                                        </label>
                                        <div class="col-md-8 col-md-offset-2">
                                            <input type="time" class="form-control" id="time" value="14:38:00">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="datetime">Datetime:
                                        </label>
                                        <div class="col-md-8 col-md-offset-2">
                                            <input type="datetime-local" class="form-control" id="datetime" value="yyyy-mm-dd T14:38:00">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4" for="week">Week:
                                        </label>
                                        <div class="col-md-8 col-md-offset-2">
                                            <input type="week" class="form-control" id="week" value="2017-W28">
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="col-md-4 control-label" for="example-multiple-select2">Multiple:</label>
                                        <div class="col-md-8 col-md-offset-2">
                                            <select id="example-multiple-select2" name="example-multiple-select" class="form-control" size="5" multiple>
                                                <option value="1">Option #1</option>
                                                <option value="2">Option #2</option>
                                                <option value="3">Option #3</option>
                                                <option value="4">Option #4</option>
                                                <option value="5">Option #5</option>
                                                <option value="6">Option #6</option>
                                                <option value="7">Option #7</option>
                                                <option value="8">Option #8</option>
                                                <option value="9">Option #9</option>
                                                <option value="10">Option #10</option>
                                            </select>
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <div class="col-md-4">
                                            <label class="control-label" >Dropdowns</label>
                                        </div>
                                        <div class="col-md-8">
                                            <b-input-group>
                                                <b-form-input></b-form-input>
                                                <template slot="prepend">
                                                    <b-dropdown text="Action" variant="secondary">
                                                        <b-dropdown-item>Action</b-dropdown-item>
                                                        <b-dropdown-item>Action B</b-dropdown-item>
                                                        <b-dropdown-divider></b-dropdown-divider>
                                                        <b-dropdown-item>Something else here...</b-dropdown-item>
                                                    </b-dropdown>
                                                </template>
                                            </b-input-group>
                                            <b-input-group class="mt-3">
                                                <b-form-input></b-form-input>
                                                <template slot="append">
                                                    <b-dropdown text="Action" variant="secondary">
                                                        <b-dropdown-item>Action</b-dropdown-item>
                                                        <b-dropdown-item>Action B</b-dropdown-item>
                                                        <b-dropdown-divider></b-dropdown-divider>
                                                        <b-dropdown-item>Something else here...</b-dropdown-item>
                                                    </b-dropdown>
                                                </template>
                                            </b-input-group>
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4">Radios:</label>
                                        <div class="col-md-8 col-md-offset-2">
                                            <div class="radio">
                                                <b-form-radio checked="false">
                                                    Normal
                                                </b-form-radio>
                                            </div>
                                            <div class="radio">
                                                <b-form-radio>
                                                    Checked
                                                </b-form-radio>
                                            </div>
                                            <div class="radio">
                                                <b-form-radio :disabled=true checked="false">
                                                    Disabled
                                                </b-form-radio>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group p-10">
                                        <label class="control-label col-md-4">Checkbox:</label>
                                        <div class=" col-md-8 col-md-offset-2">
                                            <div class="checkbox">
                                                <b-form-checkbox checked="false">
                                                    Normal
                                                </b-form-checkbox>
                                            </div>
                                            <div class="checkbox">
                                                <b-form-checkbox checked="true">
                                                    Checked
                                                </b-form-checkbox>
                                            </div>
                                            <div class="checkbox">
                                                <b-form-checkbox :disabled=true>
                                                    Disabled
                                                </b-form-checkbox>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group p-10 form-actions">
                                        <div class="col-md-offset-4 col-md-8">
                                            <button type="button" class="btn btn-primary">Submit
                                            </button>
                                            <button type="reset" class="btn btn-effect-ripple btn-secondary  reset_btn1">
                                                Reset
                                            </button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </b-card>
            </div>
        </div>
    </div>
</template>
<script>
export default {
    name: "formelements",
    mounted: function() {

    },
    destroyed: function() {

    }
}
</script>
<style type="text/css" scoped>
#color {
    height: 35px;
}
    /deep/ .form-control:disabled{
        cursor: not-allowed;
    }
    .disabled{
        cursor:not-allowed;
    }
.form-control:active, .input-group .form-control:hover{
    z-index: 1;
}
</style>
