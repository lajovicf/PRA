import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        Employees: [],
        selected: "1",
        options: []
      }
    },
    created(){
        this.loadProjects();
        this.loadEmployees();
    },
    methods:{
        loadEmployees() {
            axios.get("http://localhost:8080/getEmployeesByProjectId/"
            +this.selected)
          .then((response) => {
            this.Employees = response.data;
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