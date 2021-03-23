<template>
  <div class="container-fluid">
    <div id="app" class="container">
      <h1 class="fs-1 text-center">Tarefas</h1>

      <div class="row mb-5">
        <div class="col">
          <CardAddTask />
        </div>
      </div>

      <div class="row">
        <div class="col mb-3">
          <CardTask titulo="Teste de titulo" detalhe="teste de detalhes" />
        </div>
      </div>
    </div>
  </div>
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
