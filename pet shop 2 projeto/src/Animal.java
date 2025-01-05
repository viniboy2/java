    public class Animal {
        private String nome;
        private String tamanho;
        private float idade;

        public String getTamanho() {return tamanho; }

        public Animal setTamanho(String tamanho) {
            this.tamanho = tamanho;
            return this;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;

        }

        public float getIdade() {
            return idade;
        }

        public Animal setIdade(float idade) {
            this.idade = idade;
            return this;
        }
    }






