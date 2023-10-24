package com.mycompany.lolkinator;

import javax.swing.JOptionPane;

public class JogoPerguntas {
    
    Campeoes darius = new Campeoes("Darius","Masculino", "Topo", "Humano", "Mana", "Corpo-a-Corpo", "Noxus", "2012");
    Campeoes diana = new Campeoes("Diana","Feminino", "Caçador", "Aspecto", "Mana", "Corpo-a-Corpo", "Monte Targon", "2012");
    Campeoes draven = new Campeoes("Draven","Masculino", "Atirador", "Humano", "Mana", "Longo Alcance", "Noxus", "2012");
    Campeoes elise = new Campeoes("Elise","Feminino", "Caçador", "Humano", "Mana", "Ambos", "Noxus", "2012");
    Campeoes gnar = new Campeoes("Gnar","Masculino", "Topo", "Yordle", "Fúria", "Ambos", "Bandópolis", "2014");
    Campeoes leona = new Campeoes("Leona","Feminino", "Suporte", "Aspecto", "Mana", "Corpo-a-Corpo", "Monte Targom", "2011");
    Campeoes lulu = new Campeoes("Lulu","Feminino", "Suporte", "Yordle", "Mana", "Longo Alcance", "Bandópolis", "2012");
    Campeoes nocturne = new Campeoes("Nocturne","Masculino", "Caçador", "Demônio", "Mana", "Corpo-a-Corpo", "Runeterra", "2011");
    Campeoes reksai = new Campeoes("Rek'Sai","Feminino", "Caçador", "Cria do Vazio", "Fúria", "Corpo-a-Corpo", "Vazio", "2014");
    Campeoes riven = new Campeoes("Riven","Feminino", "Topo", "Humano", "Nada", "Corpo-a-Corpo", "Noxus", "2011");
    Campeoes talon = new Campeoes("Talon","Masculino", "Meio", "Humano", "Mana", "Corpo-a-Corpo", "Noxus", "2011");
    Campeoes varus = new Campeoes("Varus","Masculino", "Atirador", "Humano", "Mana", "Longo Alcance", "Runeterra", "2012");
    Campeoes velkoz = new Campeoes("Vel'Koz","Masculino", "Meio", "Cria do Vazio", "Mana", "Longo Alcance", "Vazio", "2014");
    Campeoes resposta = new Campeoes("Resposta","Padrão", "Padrão", "Padrão", "Padrão", "Padrão", "Padrão", "Padrão");
    
    public void iniciarJogo(){
        
        int existe = 0;
        
        Object[] genero = {"Masculino", "Feminino", "Outro"};
        Object[] posicao = {"Topo", "Caçador", "Meio", "Atirador", "Suporte"};
        Object[] especie = {"Aspecto", "Cria do Vazio", "Demônio","Humano", "Yordle"};
        Object[] recurso = {"Coragem", "Energia", "Fúria","Mana", "Nada"};
        Object[] tipo_de_alcance = {"Corpo-a-Corpo", "Longo Alcance", "Ambos"};
        Object[] regiao = {"Bandópolis", "Monte Targon", "Noxus", "Runeterra", "Vazio"};
        Object[] ano_de_lancamento = {"2011", "2012", "2013", "2014", "2015"};
        
        
        JOptionPane.showMessageDialog(null, "Bem-Vindo ao LoLkinator!!\n\n\nPense em um dos campeões abaixo: \n\nDarius\nDiana\nDraven\nElise\nGnar\nLeona\nLulu\nNocturne\nRek'Sai\nRiven\nTalon\nVarus\nVel'Koz");
        
        // Perguntas
        Object selectedValue = JOptionPane.showInputDialog(null, "Qual o gênero do campeão?", "LoLkinator",JOptionPane.INFORMATION_MESSAGE, null, genero, genero[0]);
        resposta.genero = selectedValue.toString();
        selectedValue = JOptionPane.showInputDialog(null, "Em qual posição o campeão é popularmente jogado?", "LoLkinator",JOptionPane.INFORMATION_MESSAGE, null, posicao, posicao[0]);
        resposta.posicao = selectedValue.toString();
        selectedValue = JOptionPane.showInputDialog(null, "Qual a espécie do campeão?", "LoLkinator",JOptionPane.INFORMATION_MESSAGE, null, especie, especie[0]);
        resposta.especie = selectedValue.toString();
        selectedValue = JOptionPane.showInputDialog(null, "Qual recurso o campeão utiliza para o uso de habilidades?", "LoLkinator",JOptionPane.INFORMATION_MESSAGE, null, recurso, recurso[0]);
        resposta.recurso = selectedValue.toString();
        selectedValue = JOptionPane.showInputDialog(null, "Qual o tipo de alcance do campeão?", "LoLkinator",JOptionPane.INFORMATION_MESSAGE, null, tipo_de_alcance, tipo_de_alcance[0]);
        resposta.tipo_de_alcance = selectedValue.toString();
        selectedValue = JOptionPane.showInputDialog(null, "De qual região esse campeão é?", "LoLkinator",JOptionPane.INFORMATION_MESSAGE, null, regiao, regiao[0]);
        resposta.regiao = selectedValue.toString();
        selectedValue = JOptionPane.showInputDialog(null, "Qual o ano de lançamento desse campeão?", "LoLkinator",JOptionPane.INFORMATION_MESSAGE, null, ano_de_lancamento, ano_de_lancamento[0]);
        resposta.ano_de_lancamento = selectedValue.toString();
        
        // Gênero
        switch (resposta.genero){
            case ("Masculino"):
                // Posição
                switch (resposta.posicao){
                    case ("Topo"):
                        // Espécie
                        switch (resposta.especie){
                            case ("Humano"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Corpo-a-Corpo"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Noxus"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2012"):
                                                                JOptionPane.showMessageDialog(null, "O campeão que você escolheu foi o " + darius.nome + "!!\n\nGênero: " + darius.genero + "\nPosição: " + darius.posicao + "\nEspécie: " + darius.especie + "\nRecurso: " + darius.recurso + "\nTipo de Alcance: " + darius.tipo_de_alcance + "\nRegião: " + darius.regiao + "\nAno de Lançamento: " + darius.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;
                            case ("Yordle"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Fúria"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Ambos"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Bandópolis"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2014"):
                                                                JOptionPane.showMessageDialog(null, "O campeão que você escolheu foi o " + gnar.nome + "!!\n\nGênero: " + gnar.genero + "\nPosição: " + gnar.posicao + "\nEspécie: " + gnar.especie + "\nRecurso: " + gnar.recurso + "\nTipo de Alcance: " + gnar.tipo_de_alcance + "\nRegião: " + gnar.regiao + "\nAno de Lançamento: " + gnar.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;
                        }       
                        break;
                    case ("Caçador"):
                        // Espécie
                        switch (resposta.especie){
                            case ("Demônio"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Corpo-a-Corpo"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Runeterra"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2011"):
                                                                JOptionPane.showMessageDialog(null, "O campeão que você escolheu foi o " + nocturne.nome + "!!\n\nGênero: " + nocturne.genero + "\nPosição: " + nocturne.posicao + "\nEspécie: " + nocturne.especie + "\nRecurso: " + nocturne.recurso + "\nTipo de Alcance: " + nocturne.tipo_de_alcance + "\nRegião: " + nocturne.regiao + "\nAno de Lançamento: " + nocturne.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;
                        }      
                    case ("Meio"):
                        // Espécie
                        switch (resposta.especie){
                            case ("Humano"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Corpo-a-Corpo"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Noxus"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2011"):
                                                                JOptionPane.showMessageDialog(null, "O campeão que você escolheu foi o " + talon.nome + "!!\n\nGênero: " + talon.genero + "\nPosição: " + talon.posicao + "\nEspécie: " + talon.especie + "\nRecurso: " + talon.recurso + "\nTipo de Alcance: " + talon.tipo_de_alcance + "\nRegião: " + talon.regiao + "\nAno de Lançamento: " + talon.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;
                            case ("Cria do Vazio"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Longo Alcance"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Vazio"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2014"):
                                                                JOptionPane.showMessageDialog(null, "O campeão que você escolheu foi o " + velkoz.nome + "!!\n\nGênero: " + velkoz.genero + "\nPosição: " + velkoz.posicao + "\nEspécie: " + velkoz.especie + "\nRecurso: " + velkoz.recurso + "\nTipo de Alcance: " + velkoz.tipo_de_alcance + "\nRegião: " + velkoz.regiao + "\nAno de Lançamento: " + velkoz.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;
                        }
                        break;
                    case ("Atirador"):
                        // Espécie
                        switch (resposta.especie){
                            case ("Humano"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Longo Alcance"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Noxus"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2012"):
                                                                JOptionPane.showMessageDialog(null, "O campeão que você escolheu foi o " + draven.nome + "!!\n\nGênero: " + draven.genero + "\nPosição: " + draven.posicao + "\nEspécie: " + draven.especie + "\nRecurso: " + draven.recurso + "\nTipo de Alcance: " + draven.tipo_de_alcance + "\nRegião: " + draven.regiao + "\nAno de Lançamento: " + draven.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                    case ("Runeterra"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2012"):
                                                                JOptionPane.showMessageDialog(null, "O campeão que você escolheu foi o " + varus.nome + "!!\n\nGênero: " + varus.genero + "\nPosição: " + varus.posicao + "\nEspécie: " + varus.especie + "\nRecurso: " + varus.recurso + "\nTipo de Alcance: " + varus.tipo_de_alcance + "\nRegião: " + varus.regiao + "\nAno de Lançamento: " + varus.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;    
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;
                        }
                        break;
                }
                break;
            case ("Feminino"):
                // Posição
                switch (resposta.posicao){
                    case ("Topo"):
                        // Espécie
                        switch (resposta.especie){
                            case ("Humano"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Nada"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Corpo-a-Corpo"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Noxus"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2011"):
                                                                JOptionPane.showMessageDialog(null, "A campeã que você escolheu foi a " + riven.nome + "!!\n\nGênero: " + riven.genero + "\nPosição: " + riven.posicao + "\nEspécie: " + riven.especie + "\nRecurso: " + riven.recurso + "\nTipo de Alcance: " + riven.tipo_de_alcance + "\nRegião: " + riven.regiao + "\nAno de Lançamento: " + riven.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;
                        }
                        break;
                    case ("Caçador"):
                        // Espécie
                        switch (resposta.especie){
                            case ("Aspecto"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Corpo-a-Corpo"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Monte Targon"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2012"):
                                                                JOptionPane.showMessageDialog(null, "A campeã que você escolheu foi a " + diana.nome + "!!\n\nGênero: " + diana.genero + "\nPosição: " + diana.posicao + "\nEspécie: " + diana.especie + "\nRecurso: " + diana.recurso + "\nTipo de Alcance: " + diana.tipo_de_alcance + "\nRegião: " + diana.regiao + "\nAno de Lançamento: " + diana.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;   
                            case ("Humano"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Ambos"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Noxus"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2012"):
                                                                JOptionPane.showMessageDialog(null, "A campeã que você escolheu foi a " + elise.nome + "!!\n\nGênero: " + elise.genero + "\nPosição: " + elise.posicao + "\nEspécie: " + elise.especie + "\nRecurso: " + elise.recurso + "\nTipo de Alcance: " + elise.tipo_de_alcance + "\nRegião: " + elise.regiao + "\nAno de Lançamento: " + elise.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break; 
                            case ("Cria do Vazio"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Fúria"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Corpo-a-Corpo"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Vazio"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2014"):
                                                                JOptionPane.showMessageDialog(null, "A campeã que você escolheu foi a " + reksai.nome + "!!\n\nGênero: " + reksai.genero + "\nPosição: " + reksai.posicao + "\nEspécie: " + reksai.especie + "\nRecurso: " + reksai.recurso + "\nTipo de Alcance: " + reksai.tipo_de_alcance + "\nRegião: " + reksai.regiao + "\nAno de Lançamento: " + reksai.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;      
                        }
                        break;
                    case ("Suporte"):
                        // Espécie
                        switch (resposta.especie){
                            case ("Aspecto"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Corpo-a-Corpo"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Monte Targon"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2011"):
                                                                JOptionPane.showMessageDialog(null, "A campeã que você escolheu foi a " + leona.nome + "!!\n\nGênero: " + leona.genero + "\nPosição: " + leona.posicao + "\nEspécie: " + leona.especie + "\nRecurso: " + leona.recurso + "\nTipo de Alcance: " + leona.tipo_de_alcance + "\nRegião: " + leona.regiao + "\nAno de Lançamento: " + leona.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;
                            case ("Yordle"):
                                // Recurso
                                switch (resposta.recurso){
                                    case ("Mana"):
                                        // Tipo de Alcance
                                        switch (resposta.tipo_de_alcance){
                                            case ("Longo Alcance"):
                                                // Região
                                                switch (resposta.regiao){                                                   
                                                    case ("Bandópolis"):
                                                        // Ano de Lançamento
                                                        switch (resposta.ano_de_lancamento){
                                                            case ("2012"):
                                                                JOptionPane.showMessageDialog(null, "A campeã que você escolheu foi a " + lulu.nome + "!!\n\nGênero: " + lulu.genero + "\nPosição: " + lulu.posicao + "\nEspécie: " + lulu.especie + "\nRecurso: " + lulu.recurso + "\nTipo de Alcance: " + lulu.tipo_de_alcance + "\nRegião: " + lulu.regiao + "\nAno de Lançamento: " + lulu.ano_de_lancamento);
                                                                existe = 1;
                                                                break;
                                                        }    
                                                        break;
                                                }    
                                                break;
                                        }    
                                        break;
                                }                      
                                break;  
                        }                      
                        break;         
                }
                break;                    
        }
        
        if (existe == 0){
            JOptionPane.showMessageDialog(null, "Não existe nenhum campeão com essas características.");
        }
    }
}
