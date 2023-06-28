import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        Tasks: [],
        selected: "1",
        options: []
      }
    },
    created(){
        this.loadProjects();
        this.loadTasks();
    },
    methods:{
        loadTasks() {
            axios.get("http://localhost:8080/getTasksByProjectId/"
            +this.selected)
          .then((response) => {
            this.Tasks = response.data;
          })
          .catch((error) => console.error(error));
         },
         loadProjects(){
            axios.get("http://localhost:8080/getProjectsForSelect")
            .then((response) => {
              this.options = response.data;
            })
            .catch((error) => console.error(error));
           }
    }
  }).mount('#app')