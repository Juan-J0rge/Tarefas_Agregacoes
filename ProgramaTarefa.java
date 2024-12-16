package Atividade;

public class ProgramaTarefa {
    public static void main(String[] args) {
        PessoaJuridica pesJ = new PessoaJuridica();
        pesJ.setNomeESobrenome("Juan Jorge");
        pesJ.setIdade(19);
        pesJ.setCpf(000000000-00L);
        pesJ.setEmpresa("Mercado Bom Demais");
        pesJ.setCnpj(123456789L);




        PessoaFisica pesF = new PessoaFisica();
        pesF.setNomeESobrenome("Joao George");
        pesF.setIdade(20);
        pesF.setCpf(100000000-00L);
        pesF.setTrabalho("Almoxarifado Industrial");


        imprimirPessoaFisica(pesF);
        System.out.println(" ");
        imprimirPessoaJuridica(pesJ);
    }

    private static void imprimirPessoaJuridica(PessoaJuridica pj) {
        System.out.println("Pessoa Juridica:");
        System.out.println("Nome: " + pj.getNomeESobrenome());
        System.out.println("Idade: " + pj.getIdade());
        System.out.println("Cpf: " + pj.getCpf());
        System.out.println("CNPJ: " + pj.getCnpj());
        System.out.println("Empresa: " + pj.getEmpresa());
    }

    private static void imprimirPessoaFisica(PessoaFisica pf) {
        System.out.println("Pessoa Fisica:");
        System.out.println("Nome: " + pf.getNomeESobrenome());
        System.out.println("Idade: " + pf.getIdade());
        System.out.println("Cpf: " + pf.getCpf());
        System.out.println("Trabalho: " + pf.getTrabalho());
    }


}
