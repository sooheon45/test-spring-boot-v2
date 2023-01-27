
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import AManager from "./components/listers/ACards"
import ADetail from "./components/listers/ADetail"

import BManager from "./components/listers/BCards"
import BDetail from "./components/listers/BDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/as',
                name: 'AManager',
                component: AManager
            },
            {
                path: '/as/:id',
                name: 'ADetail',
                component: ADetail
            },

            {
                path: '/bs',
                name: 'BManager',
                component: BManager
            },
            {
                path: '/bs/:id',
                name: 'BDetail',
                component: BDetail
            },



    ]
})
