<template>
  <div class="container-fluid">
    <div id="app" class="container">
        <div class="row">
            <div class="col">
                <h1 class="fs-1 text-center">Tarefas</h1>
                <CardAddTask/>
            </div>
        </div>
    </div>
  </div>
</template>

<script>
import CardAddTask from "./components/CardAddTask.vue";

export default {
  name: "App",
    components: {
      CardAddTask,
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
