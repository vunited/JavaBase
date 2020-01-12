<template>
    <div class="row">
        <div class="col-sm-4 col-md-4 mt-3">
            <div class="chatalign">
                <v-scroll :height="'100%'" color="#ccc" bar-width="3px">
                    <ul>
                        <li v-for="(user,index) in list" class="chat_block" :key="index">
                            <a :href="user.user" @click.prevent="show_chat(user,index)">
                                <article class="media">
                                    <a class="float-left desc-img mt-3">
                                        <img :src="user.image" class="img-fluid rounded-circle">
                                    </a>
                                    <span class="status-online  m-t-10"></span>
                                    <div class="media-body pl-3 mb-1 mt-3 chat_content">
                                        <a class="c-head text-success " href="javascript:void(0)">{{user.user}}</a>
                                        <p class="text-muted">
                                            <span>{{ user.status }}</span>

                                        </p>
                                    </div>
                                    <span class="mt-4 text-muted">12.54</span>
                                </article>
                            </a>
                        </li>
                    </ul>
                </v-scroll>
            </div>
        </div>
        <div class="col-sm-4 col-md-5 mt-3">
            <div class="converstion_back">
                <div class="chat_header" :class="bgColor">
                    <span class="pl-4">
                        <img :src="list[selected_user_index].image" class="img-fluid rounded-circle desc-img ">

                    </span>
                    <span class="pl-3 person_name text_dark">{{ list[selected_user_index].user }} </span>
                    <div class="float-right">
                        <div class="colors"><span >Select Image</span></div>
                        <label class="bg1"><input type="radio" :value="require('img/pages/chat_background.png')" v-model="bgColor" class="d-none">
                            </label>
                        <label class="bg2"><input type="radio" :value="require('img/pages/chat_background2.jpg')" v-model="bgColor" class="d-none"></label>
                        <label class="bg3"><input type="radio" :value="require('img/pages/chat_background3.jpg')" v-model="bgColor" class="d-none"></label>
                    </div>
                </div>
                <v-scroll :height="'calc(100% - 79px)'" color="#ccc" bar-width="3px" ref="message_scroller" :style="{ backgroundImage: 'url('+bgColor+')'}">
                    <ul>
                        <li v-for='(item,index) in list[selected_user_index].messages' :key="index" :class="[{ sent: item.from=='me' },{ received: item.from!=='me' }]">
                            <div>
                                <div class="msg_time">{{item.time}}</div>
                                <p>{{ item.msg }}</p>
                            </div>
                        </li>
                    </ul>
                </v-scroll>
                <div class="input-group text-field">
                    <input type="text" @keyup.enter="send_message" v-model="newmessage" placeholder="New Message" class="chat_input form-control"
                        ref="input">
                    <span class="input-group-btn">
                        <button class="btn btn-success send-btn" type="submit" @click="send_message">
                            <i class="fa fa-paper-plane-o text-white" aria-hidden="true"></i>
                        </button>
                    </span>
                </div>
            </div>
        </div>
        <div class="col-sm-4 col-md-3 mt-3">
            <div class="profile text-center">
                <img :src="list[selected_user_index].image" alt="User Image" class="rounded-circle img-fluid profile-thumb mb-3">
                <h4 class="text-gray">{{list[selected_user_index].user}}</h4>
                <p>{{list[selected_user_index].status}}</p>
            </div>
        </div>
    </div>
</template>
<script>
    import vScroll from "../../plugins/scroll/vScroll.vue";
    export default {
        props: {
            list: {
                default: []
            }
        },
        components: {
            vScroll
        },
        mounted() {

        },
        data() {
            return {
//                images: [ '~img/pages/chat_background.png', '~img/pages/chat_background.png', '~img/pages/chat_background.png'],
                bgColor:require('img/pages/chat_background.png'),
                className:'',
                newmessage: '',
                selected_user_index: 0,
            }
        },
        methods: {
            send_message() {
                if (this.newmessage.trim() != "") {
                    this.list[this.selected_user_index].messages.push({
                        msg: this.newmessage,
                        from: "me"
                    });
                    this.newmessage = "";
                    this.$refs.message_scroller.scrolltobottom();
                }
            },
            show_chat(user, index) {
                this.selected_user_index = index;
                setTimeout(() => {
                    this.$refs.input.focus();
                }, 20)
            }
        }
    }
</script>
<style scoped lang="scss">
    .desc-img {
        height: 40px;
        width: 40px;
    }

    .chat_block {
        border-bottom: 1px solid #f4f2f2;
    }

    .chatalign {
        background-color: #fff !important;
        height: 100%;
        ul {
            padding: 0;
        }
        /deep/ .ss-container{
            padding-right: 10px;
        }
    }

    .converstion_back {
        height: 100%;
        overflow: hidden;
        background: #fff !important;
        border: 1px solid #d8d6d6;

        ul {
            padding: 0;
        }
        &>.chat_header {
            background-color: #eaf5ff;
            padding: 4px;
            font-size: 20px;
            font-weight: 500;
            label{
                width: 25px;
                height: 25px;
            }
            .bg1{
                background-image: url("~img/pages/chat_background.png");
            }
            .bg2{
                background-image: url("~img/pages/chat_background2.jpg");
            }
            .bg3{
                background-image: url("~img/pages/chat_background3.jpg");
            }
        }
       /deep/ .ss-wrapper{
         height: 90%;
        }
    }

    .received div p,
    .sent div p {
        border-radius: 7px;
        display: inline-block;
        padding: 7px 12px;
        position: relative;
        border: 1px solid #d4d2d2;
    }
    .received div p::after{
        content: ' ';
        position: absolute;
        width: 0;
        height: 0;
        left: -12px;
        right: auto;
        top: 0px;
        bottom: auto;
        border: 12px solid;
        border-color: #dbf2fa transparent transparent transparent;
    }
    .received div p::before{
        content: ' ';
        position: absolute;
        width: 0;
        height: 0;
        left: -12px;
        right: auto;
        top: -1px;
        bottom: auto;
        border: 12px solid;
        border-color: #d4d2d2 transparent transparent transparent;
    }
    .sent div p::before{
        content: ' ';
        position: absolute;
        width: 0;
        height: 0;
        right: -13px;
        top: -1px;
        bottom: auto;
        border: 12px solid;
        border-color: #d4d2d2 transparent transparent transparent;
    }
    .sent div p::after{
        content: ' ';
        position: absolute;
        width: 0;
        height: 0;
        right: -12px;
        top: 0;
        bottom: auto;
        border: 12px solid;
        border-color: #fff transparent transparent transparent;
    }

    .self {
        justify-content: flex-end;
        align-items: flex-end;
    }
    .self .msg {
        order: 1;
        border-bottom-right-radius: 0px;
        box-shadow: 1px 2px 0px #D4D4D4;
    }

    .sent>div {
        text-align: right;
        padding: 0 17px 0 17px;
        .msg_time{
            font-size: 9px;
        }
        p {
            background-color: #fff;
        }
    }

    .received>div {
        text-align: left;
        padding: 0 17px 0 17px;
        .msg_time{
            font-size: 9px;
        }
        p {
            background-color: #dbf2fa;
        }
    }


    .chat_input {
        padding: 5px;
        border: none;
        width: 100%;
        border-top: 1px solid #eee;
        &:focus {
            box-shadow: none;
        }
    }

    .chat_content {
        overflow: hidden;
        text-overflow: ellipsis;
    }

    .send-btn {
        border-radius: 0;
    }

    .status-online {
        width: 12px;
        height: 12px;
        border-radius: 6px;
        background-color: #63c17f;
        position: relative;
        top: 40px;
        left: -8px;
        border: 2px solid #fff;
    }

    .person_name:before {
        content: ' \25CF';
        font-size: 21px;
        position: relative;
        top: -11px;
        left: -27px;
        color: #63c17f;
    }

    .profile {
        padding-bottom: 15px;
        border: none;
        height: 100%;
        overflow-y: auto;
        background-color: #FFFFFF;
    }
    .wrapper .converstion_back .ss-container{
        background-image: url("~img/pages/chat_background.png");
    }
    .bgcolor{
        border:2px solid #fff;
        height: 10px;
        width:10px;
    }
    .colors{
        line-height: 1rem;
        margin-top: 2px;
        span{
            font-size: 10px;
        }
    }
</style>
