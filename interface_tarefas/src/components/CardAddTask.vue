<template>
  <v-card>
    <v-card-title> Adicionar nova tarefa </v-card-title>
    <v-card-text>
      <div class="mb-3">
        <v-text-field type="text" id="titulo" label="Título"> </v-text-field>
      </div>
      <div class="mb-3">
        <v-textarea id="detalhe" label="Detalhe" rows="3"></v-textarea>
      </div>
      <div class="text-center mb-3">
        <v-btn class="mx-2" fab dark color="success" @click="salvar">
          <v-icon> mdi-plus </v-icon>
        </v-btn>
      </div>
    </v-card-text>
  </v-card>
</template>

<script>
export default {
  name: "CardAddTask",
  methods: {
    salvar() {
      this.axios
        .post("http://localhost:8080/save", {
          detalhe: document.getElementById("detalhe").value,
          id: 0,
          titulo: document.getElementById("titulo").value,
        })
        .then((response) => {
          if (response.data) document.location.reload();
        })
        .catch((error) => console.log(error));
    },
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped></style>
