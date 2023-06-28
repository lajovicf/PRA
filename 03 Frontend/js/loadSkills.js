import { createApp } from 'https://unpkg.com/vue@3/dist/vue.esm-browser.js'

createApp({
  data() {
    return {
      skills: [],
      skill: {
        idSkill: "",
        nameSkill: "",
        descSkill: ""
      },
      skillDown: {
        idSkill: "",
        nameSkill: "",
        descSkill: ""
      },
      message: " ",
      selected: false
    }

  },
  created() {
    this.loadSkills();
  },
  methods: {
	deleteSkill() {
      // Make a GET request to delete the skill
      axios
        .get(`http://localhost:8080/deleteSkill/${idSkill}`)
        .then(() => {
          // Refresh the current HTML page
          location.reload();
        })
        .catch(error => {
          console.error('Napaka pri brisanju: {idSkill}', error);
        });
    },  
    loadSkills() {
      axios.get("http://localhost:8080/getAllSkills")
        .then((response) => {
          this.skills = response.data;
        })
        .catch((error) => console.error(error));
    },
    postSkill() {
      if (this.selected) {
        axios.post("http://localhost:8080/addOrUpdateSkill", this.skillDown)
          .then((response) => {
            this.message = "Spretnost je uspešno ustvarjena";
            this.loadSkills();
            var toastElList = [].slice.call(document.querySelectorAll('.toast'))
            var toastList = toastElList.map(function (toastEl) {
              return new bootstrap.Toast(toastEl)
            })
            toastList.forEach(toast => toast.show())
          })
          .catch((error) => console.error(error));
      } else {
        this.message = "Prvo se morate strinjati s pogoji uporabe";
        var toastElList = [].slice.call(document.querySelectorAll('.toast'))
        var toastList = toastElList.map(function (toastEl) {
          return new bootstrap.Toast(toastEl)
        })
        toastList.forEach(toast => toast.show())
      }
    },
    clickList: function (skill) {
      Object.assign(this.skillDown, skill)
    }
  }
}).mount('#app')