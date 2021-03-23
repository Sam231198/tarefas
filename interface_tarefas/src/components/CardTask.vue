<template>
    <div class="card text-center text-white bg-dark shadow">
      <div class="bg-secondary card-header">{{ titulo }}</div>
      <div class="card-body">{{ detalhe }}</div>
    </div>
</template>

<script>
export default {
  name: "CardAddTask",
  props: {
      titulo: String,
      detalhe: String
  }
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
