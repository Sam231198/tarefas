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
            :key="tarefa.key"
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
      tarefas: [
        {
          titulo: "Titulo 1",
          detalhe: "Detalhe 1",
        },
        {
          titulo: "Titulo 2",
          detalhe: "Detalhe 2",
        },
        {
          titulo: "Titulo 3",
          detalhe: "Detalhe 3",
        },
        {
          titulo: "Titulo 4",
          detalhe: "Detalhe 4",
        },
        {
          titulo: "Titulo 5",
          detalhe: "Detalhe 5",
        },
      ],
    };
  },
};
</script>

<style>
/* #app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
} */
</style>
