const base = {
    get() {
        return {
            url : "http://localhost:8080/zaixiankaoshixuexijiaoliu/",
            name: "zaixiankaoshixuexijiaoliu",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/zaixiankaoshixuexijiaoliu/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "在线考试与学习交流网页"
        } 
    }
}
export default base
