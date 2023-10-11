package br.senai.sp.jandira.Model;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Alojamento {
    private Map<String, List<Animal>> alojamentos = new HashMap<>();

    public void adicionarAnimal(Animal animal) {
        String especie = animal.getClass().getSimpleName();
        alojamentos.putIfAbsent(especie, new ArrayList<>());
        alojamentos.get(especie).add(animal);
    }

    public void listarAnimaisPorEspecie() {
        for (String especie : alojamentos.keySet()) {
            List<Animal> animais = alojamentos.get(especie);
            System.out.println("Animais da espécie " + especie + ":");
            for (Animal animal : animais) {
                System.out.println("Nome: " + animal.getNome() + ", Idade: " + animal.getIdade());
            }
        }
    }
}

