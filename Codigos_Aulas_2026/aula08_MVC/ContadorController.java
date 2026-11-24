package aula08_MVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContadorController {
    private ContadorModel model;
    private ContadorView view;

    public ContadorController() {
        this.model = new ContadorModel();
        this.view = new ContadorView();

        //Conectar os botões (view) com as regras de negócio (model)

        this.view.addListenerIncremento(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.incrementar();
                view.atualizarContador(model.getValor());
            }
        });

        this.view.addListenerDecremento(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                model.decrementar();
                view.atualizarContador(model.getValor());
            }
        });

    }
}
