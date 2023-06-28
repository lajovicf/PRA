import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        task: {
            idTask:"",
            nameTask:"",
            descTask:"",
			dateTask:"",
			minutesTask:"",
            project:{
                idProject: "1",
                nameProject: "",
                descProject: ""
            },
			employee:{
				idEmployee:"1",
				firstNameEmployee:"",
            	lastNameEmployee:""
            },
			skill:{
				idSkill:"1",
				nameSkill:"",
            	descSkill:""
            }
        },
        optionsProjects: [],
		optionsEmployees: [],
		optionsSkills: [],
        message:" "
      }
    },
    created(){
        this.loadProjects();
		this.loadEmployees();
		this.loadSkills();
    },
    methods:{
        postTask() {
   
            axios.post("http://localhost:8080/addOrUpdateTask",this.task)
          .then((response) => {
            this.message="Delovno opravilo je bilo uspešno vnešeno.";
          })
          .catch((error) => console.error(error));
         },
         loadProjects(){
          axios.get("http://localhost:8080/getProjectsForSelect")
          .then((response) => {
            this.optionsProjects = response.data;
          })
          .catch((error) => console.error(error));
         },
		 loadEmployees(){
          axios.get("http://localhost:8080/getEmployeesForSelect")
          .then((response) => {
            this.optionsEmployees = response.data;
          })
          .catch((error) => console.error(error));
         },
		loadSkills(){
          axios.get("http://localhost:8080/getSkillsForSelect")
          .then((response) => {
            this.optionsSkills = response.data;
          })
          .catch((error) => console.error(error));
         }
    }
  }).mount('#app')