import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

  createApp({
    data() {
      return {
        skill: {
            idSkill:"",
            nameSkill:"",
            descSkill:"",
        },
        message:" "
      }
    },
 
    methods:{
        postSkill() {
   
         axios.post("http://localhost:8080/addOrUpdateSkill",this.skill)
          .then((response) => {
            this.message="Spretnost je bila uspešno ustvarjena.";
          })
          .catch((error) => console.error(error));
         }
    }
  }).mount('#app')