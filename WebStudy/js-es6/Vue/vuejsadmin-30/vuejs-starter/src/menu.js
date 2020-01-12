const menu_items = [{
        name: 'Dashboard',
        link: '/',
        icon: 'fa fa-home'
    },
    {
        name: "Pages",
        icon: "fa fa-files-o",
        child: [{
            name: 'Login',
            link: '/login',
            icon: 'fa fa-angle-double-right'
        }, {
            name: 'Register',
            link: '/register',
            icon: 'fa fa-angle-double-right'
        }, {
            name: 'Forgot password',
            link: '/forgotpassword',
            icon: 'fa fa-angle-double-right'
        }, {
            name: 'Reset password',
            link: '/reset_password',
            icon: 'fa fa-angle-double-right'
        }, {
            name: 'Lockscreen',
            link: '/lockscreen',
            icon: 'fa fa-angle-double-right'
        }]
    }
];
export default menu_items;
