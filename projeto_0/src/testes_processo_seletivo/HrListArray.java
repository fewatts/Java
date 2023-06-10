package testes_processo_seletivo;

import java.util.ArrayList;

public class HrListArray {

    public static int checkprice(
        ArrayList<String> produtos, 
        ArrayList<Float> precoProdutos, 
        ArrayList<String> produtosVendidos, 
        ArrayList<Float> produtosVendidosPreco
        ){
        int error = 0;
        for (int i = 0; i < produtosVendidos.size(); i++){
            String produtoVendido = produtosVendidos.get(i);
            Float produtoVendidoPreco = produtosVendidosPreco.get(i);

            int produtoIndex = produtos.indexOf(produtoVendido);

            if(produtoIndex >= 0 && produtoIndex < produtosVendidos.size() && i < produtosVendidosPreco.size()){
                if(!precoProdutos.get(produtoIndex).equals(produtoVendidoPreco)){
                    error++;
                }

            }

        } 
        return error;
    }


    public static void main(String[] args) {
        ArrayList<String> produtos = new ArrayList<String>();
        ArrayList<Float> precoProdutos = new ArrayList<Float>();
        ArrayList<String> produtosVendidos = new ArrayList<String>();
        ArrayList<Float> vendaProdutos = new ArrayList<Float>();
        int resultado;

        produtos.add("egg");
        produtos.add("cheese");
        produtos.add("milk");
        precoProdutos.add(4.54f);
        precoProdutos.add(2.54f);
        precoProdutos.add(5.54f);

        produtosVendidos.add("egg");
        produtosVendidos.add("cheese");
        produtosVendidos.add("milk");
        produtosVendidos.add("milk");
        vendaProdutos.add(4.55f);//errado
        vendaProdutos.add(2.55f);//errado
        vendaProdutos.add(5.54f);//cert0
        vendaProdutos.add(5.55f);//errado

        resultado = checkprice(produtos, precoProdutos, produtosVendidos, vendaProdutos);
        System.out.println("Total errors: " + resultado);
    }

}
