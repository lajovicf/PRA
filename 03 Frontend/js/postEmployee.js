import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        employee: {
            idEmployee:"",
            firstNameEmployee:"",
            lastNameEmployee:"",
            project:{
                idProject: "1",
                nameProject: "",
                descProject: ""
            }
        },
        options: [],
        message:" "
      }
    },
    created(){
        this.loadProjects();
    },
    methods:{
        postEmployee() {
   
            axios.post("http://localhost:8080/addOrUpdateEmployee",this.employee)
          .then((response) => {
            this.message="Zaposleni je uspešno ustvarjen";
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