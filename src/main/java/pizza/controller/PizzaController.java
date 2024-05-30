package pizza.controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.util.ArrayList;
import java.util.List;


public class PizzaController {

    @FXML
    public CheckBox feltetSonka;

    @FXML
    public CheckBox feltetGomba;

    @FXML
    private CheckBox feltetBacon;

    @FXML
    private CheckBox feltetKolbasz;

    @FXML
    public RadioButton meret32;

    @FXML
    private RadioButton meret45;

    @FXML
    private CheckBox feltetSajt;

    @FXML
    private CheckBox feltetCheedarsajt;

    @FXML
    private CheckBox feltetFustoltsajt;

    @FXML
    private CheckBox feltetFetasajt;

    @FXML
    private CheckBox feltetHagyma;

    @FXML
    private CheckBox feltetUborka;

    @FXML
    private CheckBox feltetOlivabogyo;

    @FXML
    private CheckBox feltetTejfol;

    @FXML
    private CheckBox feltetFokhagyma;

    @FXML
    private CheckBox feltetCsipospaprika;

    @FXML
    private CheckBox feltetKukorica;

    @FXML
    private CheckBox feltetAnanasz;

    @FXML
    private RadioButton alapParadicsom;

    @FXML
    private RadioButton alapTejfol;

    public boolean isFeltetSonkaSelected() {
        return feltetSonka.isSelected();
    }

    public boolean isFeltetGombaSelected() {
        return feltetGomba.isSelected();
    }

    public boolean isFeltetBaconSelected() {
        return feltetBacon.isSelected();
    }

    public boolean isFeltetKolbaszSelected() {
        return feltetKolbasz.isSelected();
    }

    public boolean isMeret32Selected() {
        return meret32.isSelected();
    }

    public boolean isMeret45Selected() {
        return meret45.isSelected();
    }

    public boolean isFeltetSajtSelected() {
        return feltetSajt.isSelected();
    }

    public boolean isFeltetCheedarsajtSelected() {
        return feltetCheedarsajt.isSelected();
    }

    public boolean isFeltetFustoltsajtSelected() {
        return feltetFustoltsajt.isSelected();
    }

    public boolean isFeltetFetasajtSelected() {
        return feltetFetasajt.isSelected();
    }

    public boolean isFeltetHagymaSelected() {
        return feltetHagyma.isSelected();
    }

    public boolean isFeltetUborkaSelected() {
        return feltetUborka.isSelected();
    }

    public boolean isFeltetOlivabogyoSelected() {
        return feltetOlivabogyo.isSelected();
    }

    public boolean isFeltetTejfolSelected() {
        return feltetTejfol.isSelected();
    }

    public boolean isFeltetFokhagymaSelected() {
        return feltetFokhagyma.isSelected();
    }

    public boolean isFeltetCsipospaprikaSelected() {
        return feltetCsipospaprika.isSelected();
    }

    public boolean isFeltetKukoricaSelected() {
        return feltetKukorica.isSelected();
    }

    public boolean isFeltetAnanaszSelected() {
        return feltetAnanasz.isSelected();
    }

    public boolean isAlapParadicsomSelected() {
        return alapParadicsom.isSelected();
    }

    public boolean isAlapTejfolSelected() {
        return alapTejfol.isSelected();
    }

    private List<String> selectedToppings = new ArrayList<>();
    private String selectedSize;
    public void collectSelectedToppings() {

        if (feltetSonka.isSelected()) {
            selectedToppings.add("Sonka");
        }
        if (feltetGomba.isSelected()) {
            selectedToppings.add("Gomba");
        }
        if (feltetBacon.isSelected()) {
            selectedToppings.add("Bacon");
        }
        if (feltetKolbasz.isSelected()) {
            selectedToppings.add("Kolbász");
        }
        if (feltetSajt.isSelected()) {
            selectedToppings.add("Sajt");
        }
        if (feltetCheedarsajt.isSelected()) {
            selectedToppings.add("Cheedar sajt");
        }
        if (feltetFustoltsajt.isSelected()) {
            selectedToppings.add("Füstölt sajt");
        }
        if (feltetFetasajt.isSelected()) {
            selectedToppings.add("Feta sajt");
        }
        if (feltetHagyma.isSelected()) {
            selectedToppings.add("Hagyma");
        }
        if (feltetUborka.isSelected()) {
            selectedToppings.add("Uborka");
        }
        if (feltetOlivabogyo.isSelected()) {
            selectedToppings.add("Olivabogyó");
        }
        if (feltetTejfol.isSelected()) {
            selectedToppings.add("Tejföl");
        }
        if (feltetFokhagyma.isSelected()) {
            selectedToppings.add("Fokhagyma");
        }
        if (feltetCsipospaprika.isSelected()) {
            selectedToppings.add("Csípős paprika");
        }
        if (feltetKukorica.isSelected()) {
            selectedToppings.add("Kukorica");
        }
        if (feltetAnanasz.isSelected()) {
            selectedToppings.add("Ananász");
        }

        // Méret kiválasztása
        if (meret32.isSelected()) {
            selectedSize = "32 cm";
            selectedToppings.add("32 cm");
        } else if (meret45.isSelected()) {
            selectedSize = "45 cm";
            selectedToppings.add("45 cm");
        }
    }

    public List<String> getSelectedToppings() {
        return selectedToppings;
    }
    public String getSelectedSize() {
        return selectedSize;
    }
}