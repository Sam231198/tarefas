<template>
  <div id="CardAddTask" class="card text-center">
    <div class="card-header">Adicionar nova tarefa</div>
    <div class="card-body">
      <div class="mb-3">
        <label for="titulo" class="form-label">Titulo</label>
        <input
          type="text"
          class="form-control"
          id="titulo"
        />
      </div>
      <div class="mb-3">
        <label for="detalhe" class="form-label">Detalhe</label>
        <textarea class="form-control" id="detalhe" rows="3"></textarea>
      </div>
      <div class="mb-3">
        <button class="btn btn-success">Adicionar</button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "CardAddTask",
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
#CardAddTask {
  color: black;
}

.card-body{
    background-color: #535353;
}

.card-header{
    background-color: #1a1a1a;
    color: white;
}
</style>
