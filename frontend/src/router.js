
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import InspecticmpIcmpDataManager from "./components/listers/InspecticmpIcmpDataCards"
import InspecticmpIcmpDataDetail from "./components/listers/InspecticmpIcmpDataDetail"

import RegistrationInputInfoManager from "./components/listers/RegistrationInputInfoCards"
import RegistrationInputInfoDetail from "./components/listers/RegistrationInputInfoDetail"

import InspecthttpIcmpDataManager from "./components/listers/InspecthttpIcmpDataCards"
import InspecthttpIcmpDataDetail from "./components/listers/InspecthttpIcmpDataDetail"

import InspectdnsIcmpDataManager from "./components/listers/InspectdnsIcmpDataCards"
import InspectdnsIcmpDataDetail from "./components/listers/InspectdnsIcmpDataDetail"

import ManagementClientManager from "./components/listers/ManagementClientCards"
import ManagementClientDetail from "./components/listers/ManagementClientDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/inspecticmps/icmpData',
                name: 'InspecticmpIcmpDataManager',
                component: InspecticmpIcmpDataManager
            },
            {
                path: '/inspecticmps/icmpData/:id',
                name: 'InspecticmpIcmpDataDetail',
                component: InspecticmpIcmpDataDetail
            },

            {
                path: '/registrations/inputInfos',
                name: 'RegistrationInputInfoManager',
                component: RegistrationInputInfoManager
            },
            {
                path: '/registrations/inputInfos/:id',
                name: 'RegistrationInputInfoDetail',
                component: RegistrationInputInfoDetail
            },

            {
                path: '/inspecthttps/icmpData',
                name: 'InspecthttpIcmpDataManager',
                component: InspecthttpIcmpDataManager
            },
            {
                path: '/inspecthttps/icmpData/:id',
                name: 'InspecthttpIcmpDataDetail',
                component: InspecthttpIcmpDataDetail
            },

            {
                path: '/inspectdns/icmpData',
                name: 'InspectdnsIcmpDataManager',
                component: InspectdnsIcmpDataManager
            },
            {
                path: '/inspectdns/icmpData/:id',
                name: 'InspectdnsIcmpDataDetail',
                component: InspectdnsIcmpDataDetail
            },

            {
                path: '/managements/clients',
                name: 'ManagementClientManager',
                component: ManagementClientManager
            },
            {
                path: '/managements/clients/:id',
                name: 'ManagementClientDetail',
                component: ManagementClientDetail
            },



    ]
})
