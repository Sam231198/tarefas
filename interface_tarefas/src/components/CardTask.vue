<template>
  <v-col cols="12" xl="4" lg="4" md="6" sm="12">
    <v-card>
      <v-crd-title> {{ titulo }} </v-crd-title>

      <v-card-text>
        <v-row>
          <v-col cols="9">
            {{ detalhe }}
          </v-col>
          <v-col cols="3">
            <v-btn fab dark><v-icon color="red"> mdi-delete </v-icon></v-btn>
          </v-col>
        </v-row>
      </v-card-text>

    </v-card>
  </v-col>
</template>

<script>
export default {
  name: "CardAddTask",
  props: {
    titulo: String,
    detalhe: String,
  },
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
</style>
