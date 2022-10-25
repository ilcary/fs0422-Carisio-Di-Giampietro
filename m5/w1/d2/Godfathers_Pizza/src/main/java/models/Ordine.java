package models;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Component
@PropertySource("classpath:application.properties")
@ToString
public class Ordine {
    
    private int numeroOrdine;
    private StatoOrdine statoOrdine;
    private int coperti;
    private String oraOrdine = LocalDateTime.now().getHour() + " " + LocalDateTime.now().getMinute();
    private Tavolo tavoloAssociato;
    private List<Item> elementiOrdinati;
    private double costoTotale;
    
    @Value("${Ordine.costoPerCoperto}")
    private double costoPerCoperto;

    public Ordine(int numeroOrdine, StatoOrdine statoOrdine, int coperti, Tavolo tavoloAssociato,
            List<Item> elementiOrdinati) {
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.coperti = coperti;
        this.oraOrdine = LocalDateTime.now().getHour() + " " + LocalDateTime.now().getMinute();
        this.tavoloAssociato = tavoloAssociato;
        this.elementiOrdinati = elementiOrdinati;
        this.costoTotale = setCostoTotale();
    }
    
    public Ordine(int numeroOrdine, StatoOrdine statoOrdine, int coperti, Tavolo tavoloAssociato,
            List<Item> elementiOrdinati,double costoPerCoperto) {
        this.numeroOrdine = numeroOrdine;
        this.statoOrdine = statoOrdine;
        this.coperti = coperti;
        this.oraOrdine = LocalDateTime.now().getHour() + " " + LocalDateTime.now().getMinute();
        this.tavoloAssociato = tavoloAssociato;
        this.elementiOrdinati = elementiOrdinati;
        this.costoTotale = setCostoTotale();
        this.costoPerCoperto=costoPerCoperto;
    }
    
    private double setCostoTotale() {
        double sum = 0;
        for(Item i : this.elementiOrdinati) {
            sum += i.getPrezzo();
        }
        for(int i = 0; i < this.coperti; i++) {
            sum += this.costoPerCoperto;
        }
        return sum;
    }
}