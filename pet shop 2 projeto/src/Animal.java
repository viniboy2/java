    public class Animal {
        private String nome;
        private String dono;
        private String tamanho;
        private int idade;
        private double peso;

        public String dono() {
            return dono;
        }

        public Animal setDono(String dono) {
            this.dono = dono;
            return this;
        }

        public int idade() {
            return idade;
        }

        public Animal setIdade(int idade) {
            this.idade = idade;
            return this;
        }

        public String nome() {
            return nome;
        }

        public Animal setNome(String nome) {
            this.nome = nome;
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
