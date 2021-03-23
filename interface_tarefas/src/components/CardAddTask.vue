<template>
    <div class="card text-center text-white bg-dark shadow">
      <div class="bg-secondary card-header">Adicionar nova tarefa</div>
      <div class="card-body">
        <div class="mb-3">
          <input type="text" class="form-control" id="titulo" placeholder="Título" />
        </div>
        <div class="mb-3">
          <textarea class="form-control" id="detalhe" placeholder="Detalhe" rows="3"></textarea>
        </div>
        <div class="mb-3">
          <button class="btn btn-secondary">Adicionar</button>
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
.form-control{
    background-color: transparent;
    color: white;
    border: none;
}

.form-control:focus{
    background-color: transparent;
    color: white;
}
</style>
