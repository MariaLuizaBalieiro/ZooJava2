package br.senai.sp.jandira.Model;

import java.util.HashMap;
import java.util.Map;
public class Saude {
    private Map<Animal, String> historicoMedico = new HashMap<>();
    private Map<Animal, String> dataUltimaRevisao = new HashMap<>();

    public void adicionarHistoricoMedico(Animal animal, String historico) {
        historicoMedico.put(animal, historico);
    }

    public void adicionarDataUltimaRevisao(Animal animal, String dataRevisao) {
        dataUltimaRevisao.put(animal, dataRevisao);
    }

    public void verificarVisitaVeterinario(Animal animal) {

    }
}
