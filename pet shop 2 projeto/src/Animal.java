    public class Animal {
        private String nome;
        private String tamanho;
        private int idade;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;

        }

        private double peso;



        public int idade() {
            return idade;
        }

        public Animal setIdade(int idade) {
            this.idade = idade;
            return this;
        }



        public double peso() {
            return peso;
        }

        public Animal setPeso(double peso) {
            this.peso = peso;
            return this;
        }

        public String tamanho() {
            return tamanho;
        }

        public Animal setTamanho(String tamanho) {
            this.tamanho = tamanho;
            return this;
        }
    }
