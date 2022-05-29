package Concessionaria;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		//Fabricante
		String nomeFab = null;
		String cnpj = null;
		String telefone = null;
		
		//Cliente
		String nomeCliente = null;
		String cpf = null;
		String endereco = null;
		String telefoneCliente = null;
		String email = null;

		//Opcionais
		int codigo = 0;
		String nomeOpc = null;
		//Automovel
		String modelo = null;
		String chassi = null;
		String cor = null;
		Double PrecoCusto = 0.00000000000000000000000000000000000000000;
		//Automovel Usado
		String modeloUs = null;
		String chassiUs = null;
		String corUs = null;
		Double PrecoCustoUs = 0.00000000000000000000000000000000000000000;
		int anoFabricacao = 0;
		float km = 0;
		//Menu
		int código;
		Fabricante FAB = new Fabricante(nomeFab,cnpj,telefone);
		Cliente cliente = new Cliente(nomeCliente,cpf,endereco,telefoneCliente,email);
		Opcional opcional = new Opcional(codigo,nomeOpc);
		Automovel automovel = new Automovel(FAB,modelo,chassi,cor,PrecoCusto);
		AutomovelUsado automovelUsado = new AutomovelUsado(FAB,modeloUs,chassiUs,corUs,PrecoCustoUs,anoFabricacao,km);
		
		do{
			System.out.println("Digite o número da opção para:\n"
					+ " 1- Cadastar Cliente\n"
					+ " 2- Cadastrar Fabricante\n"
					+ " 3- Cadastrar um opcional\n"
					+ " 4- Cadastar um automovel\n"
					+ " 5- Cadastrar um automovel usado\n"
					+ " 6- Realizar a venda ");
			código = Scanner.nextInt();
			
			switch(código) {
				case 1 :
					System.out.println("Digite o nome do Cliente: ");
					nomeCliente = Scanner.next();
					cliente.setNome(nomeCliente);
					System.out.println("Digite o CPF do Cliente: ");
					cpf = Scanner.nextLine();
					cliente.setCpf(cpf);
					System.out.println("Digite o telefone do Cliente: ");
					telefoneCliente = Scanner.nextLine();
					cliente.setTelefone(telefoneCliente);
					System.out.println("Digite o endereço do Cliente: ");
					endereco = Scanner.nextLine();
					cliente.setEndereco(endereco);
					System.out.println("Digite o email do Cliente: ");
					email = Scanner.nextLine();
					cliente.setEmail(email);
					
					
					break;
				case 2 :
					System.out.println("Digite o nome do fabricante:");
					nomeFab = Scanner.next();
					FAB.setNomeFantasia(nomeFab);
					System.out.println("Digite o cnpj do fabricante:");
					cnpj = Scanner.next();
					FAB.setCnpj(cnpj);
					System.out.println("Digite o telefone do fabricante:");
					telefone = Scanner.next();
					FAB.setTelefone(telefone);
					
					break;
				case 3 : 
					System.out.println("Digite o nome do opcional: ");
					nomeOpc = Scanner.next();
					opcional.setNome(nomeOpc);
					System.out.println("Digite o c�digo do opcional: ");
					codigo = Scanner.nextInt();
					opcional.setCodigo(codigo);
					break;
				case 4 :
					System.out.println("Digite o número do chassi: ");
					chassi = Scanner.next();
					automovel.setChassi(chassi);
					System.out.println("Digite o nome do modelo: ");
					modelo = Scanner.next();
					automovel.setModelo(modelo);
					System.out.println("Digite a cor do automovel: ");
					cor = Scanner.next();
					automovel.setCor(cor);
					System.out.println("Digite o preco do automovel: ");
					PrecoCusto = Scanner.nextDouble();
					automovel.setPrecoCusto(PrecoCusto);
					break;
				case 5 :
					System.out.println("Digite o número do chassi: ");
					chassiUs = Scanner.next();
					automovelUsado.setChassi(chassiUs);
					System.out.println("Digite o nome do modelo: ");
					modeloUs = Scanner.next();
					automovelUsado.setModelo(modeloUs);
					System.out.println("Digite a cor do automovel: ");
					corUs = Scanner.next();
					automovelUsado.setCor(corUs);
                    System.out.println("Digite o preco do automovel: ");
                    PrecoCustoUs = Scanner.nextDouble();
                    automovelUsado.setPrecoCusto(PrecoCustoUs);
                    System.out.println("Digite o ano de fabricacao do automovel: ");
                    anoFabricacao = Scanner.nextInt();
                    automovelUsado.setAnoFabricacao(anoFabricacao);
                    System.out.println("Digite o km do automovel: ");
                    km = Scanner.nextFloat();
                    automovelUsado.setKm(km);;
                   break;
				case 6 :
					Venda venda1 = new Venda();
					if(automovel != null ) {
						System.out.println(venda1.compraCarroUsado(cliente, automovelUsado));
					}else {
						System.out.println(venda1.compraCarroZero(cliente, automovel));
		
					}
					break;
				case 7:
					System.out.println("Sistema finalizado.");
					Scanner.close();
					break;
			}
			
		}while(código != 7 && código != 6);
        System.out.println("Sistema finalizado.");
        Scanner.close();

			
//		Cliente cliente = new Cliente();
//		Opcional opcional = new Opcional();
//		Scanner s = new Scanner(System.in);
//		System.out.println("Escolha uma das op��es:\n 1- Cadastrar fabricante\n 2- Cadastrar Cliente\n 3- Cadastar opcional");
//		int escolha = s.nextInt();
//		switch(escolha) {
//		case 1:
//			FAB.NewFabricante();
//			break;
//		case 2: 
//			cliente.NewCliente();
//			break;
//		case 3:
//			opcional.NewOpcional();
//			break;
//		}
//		f
//		System.out.println(FAB.DemonstrarFab());
//		System.out.println(opcional.DemonstrarOpcional());
//		System.out.println(cliente.DemonstrarCliente());
		
		
		
		
		
		 
		
		 
//		Fabricante chevrolet = new Fabricante("Chevrolet", "123.456.789-89", "719999");
//		Cliente alison = new Cliente("Alison", "022.444.555-88", "beco da cebola", "7199999", "alisondeles@deles.com");
//		
//		Opcional ar =  new Opcional(1, "ar");
//		Opcional alarme =  new Opcional(2, "alarme");
//		
//		
//		Automovel celta = new Automovel(chevrolet, "Celta 1.0", "999.888.444", "Vermelho", 20000.00);
//		
//		celta.addopcional(ar);
//		celta.addopcional(alarme);
//		
//		
//		//System.out.println(celta.getOpcional().get(0).getNome());
//		
//		//System.out.println(celta.getTotal());
//
//		Venda venda1 = new Venda();
//		
//		
//		//System.out.println(venda1.compraCarroZero(alison, celta));
//		
//		
//		AutomovelUsado usado = new AutomovelUsado(chevrolet, celta.getModelo() , celta.getChassi(), celta.getCor(), 20000, 2020, 10000);
//		usado.addopcional(alarme);
//		usado.addopcional(ar);
//		Venda vendaUsado = new Venda();
//		String str = String.format("%.2f", vendaUsado.compraCarroUsado(alison, usado));
//		System.out.println(str);
	}

}
