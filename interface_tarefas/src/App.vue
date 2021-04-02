<template>
  <v-app>
    <v-main>
      <v-container>
        <h1 class="text-center">Tarefas</h1>
        <v-row class="m-5">
          <v-col>
            <CardAddTask />
          </v-col>
        </v-row>

        <v-row>
          <CardTask
            v-for="tarefa in tarefas"
            :titulo="tarefa.titulo"
            :detalhe="tarefa.detalhe"
            :key="tarefa.id"
            :IdTask="tarefa.id"
          />
        </v-row>
      </v-container>
    </v-main>
  </v-app>
</template>

<script>
import CardAddTask from "./components/CardAddTask.vue";
import CardTask from "./components/CardTask.vue";

export default {
  name: "App",
  components: {
    CardAddTask,
    CardTask,
  },
  data() {
    return {
      tarefas: null,
    };
  },
  mounted() {
    this.axios
      .get("http://localhost:8080/get")
      .then((response) => (this.tarefas = response.data))
      .catch((error) => console.log(error));
  },
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Damion&display=swap");

h1 {
  font-family: "Damion", cursive;
  font-size: 90px;
}
</style>
