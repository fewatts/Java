package exercicios_extras;

import java.util.ArrayList;

public class ExIBM {

    public static int checkprice(ArrayList<String> produtos, ArrayList<Float> precoProdutos, ArrayList<String> produtosVendidos, ArrayList<Float> vendaProdutos){
        int error = 0;
        for(int j = 0; j < produtosVendidos.size(); j++){
            String nomeProd = produtos.get(j);
            Float precoProd = precoProdutos.get(j);
            String vendaProd = produtosVendidos.get(j);
            Float precoVenda = vendaProdutos.get(j);
            if(produtos.indexOf(nomeProd) == precoProdutos.indexOf(precoProd) && nomeProd.equalsIgnoreCase(vendaProd) && !precoProd.equals(precoVenda)){
                error++;
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
        vendaProdutos.add(4.55f);//errado
        vendaProdutos.add(2.55f);//errado
        vendaProdutos.add(5.54f);//cert0

        resultado = checkprice(produtos, precoProdutos, produtosVendidos, vendaProdutos);
        System.out.println("Total errors: " + resultado);
    }

}
