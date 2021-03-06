package com.example.Progetto.Gestione;

import java.io.Serializable;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface Metadati{
	String nome();
	String tipo();
}

/**
 * Classe Bean relativa agli oggetti all'interno del file csv, composta da costruttore, setters and getters ed 
 * il metodo toString()
 * 
 */
public class GareAppalti implements Serializable{		//Primi 44 attributi dei 50 totali(saltati perchè vuoti)
	
	@Metadati(nome="npgAttoAutorizzativo", tipo="Long")
    private long npgAttoAutorizzativo;
	
	@Metadati(nome="annoPgAutorizzativo",tipo="Long")
    private long annoPgAutorizzativo;
	
	@Metadati(nome="tipoGara",tipo="String")
	private String tipoGara;
	
	@Metadati(nome="titolo",tipo="String")
    private String titolo;
	
	@Metadati(nome="cig",tipo="String")
    private String cig;
	
	@Metadati(nome="oggettoAtto",tipo="String")
    private String oggettoAtto;
	
	@Metadati(nome="importoAppalto",tipo="Double")
    private double importoAppalto;
	
	@Metadati(nome="tipoAppalto",tipo="String")
    private String tipoAppalto;
	
	@Metadati(nome="durataContratto",tipo="String")
    private String durataContratto;
	
	@Metadati(nome="utilizzoMepa",tipo="String")
    private String utilizzoMepa;
	
	@Metadati(nome="dataPubblicazioneIperbole",tipo="String")
    private String dataPubblicazioneIperbole;
	
	@Metadati(nome="linkDeterminaPubblica",tipo="String")
    private String linkDeterminaPubblica;
	
	@Metadati(nome="oggettoDetermina",tipo="String")
    private String oggettoDetermina;
	
	@Metadati(nome="settore_Dipartimento",tipo="String")
    private String settore_Dipartimento;
	
	@Metadati(nome="servizio",tipo="String")
    private String servizio;
	
	@Metadati(nome="ui",tipo="String")
    private String ui;
	
	@Metadati(nome="responsabileProcedimentoGara",tipo="String")
    private String responsabileProcedimentoGara;
	
	@Metadati(nome="responsabileProcedimento",tipo="String")
    private String responsabileProcedimento;
	
	@Metadati(nome="modalitàDiAggiudicazione",tipo="String")
    private String modalitaDiAggiudicazione;
	
	@Metadati(nome="scadenzaPresentazioneOfferte",tipo="String")
    private String scadenzaPresentazioneOfferte;
	
	@Metadati(nome="oraScadenzaOfferte",tipo="String")
    private String oraScadenzaOfferte;
	
	@Metadati(nome="varianteTempiCompletamento_Durata",tipo="String")
    private String varianteTempiCompletamento_Durata;
	
	@Metadati(nome="importoSommeLiquidate",tipo="Double")
    private double importoSommeLiquidate;
	
	@Metadati(nome="npgAttoAggiudicazione",tipo="Long")
    private long npgAttoAggiudicazione;
	
	@Metadati(nome="annoPgAggiudicazione",tipo="Long")
    private long annoPgAggiudicazione;
	
	@Metadati(nome="dataAttoAggiudicazione",tipo="String")
    private String dataAttoAggiudicazione;
	
	@Metadati(nome="aggiudicatario",tipo="String")
    private String aggiudicatario;
	
	@Metadati(nome="partitaIVA",tipo="String")
    private String partitaIVA;
	
	@Metadati(nome="codiceFiscale",tipo="String")
    private String codiceFiscale;
	
	@Metadati(nome="importoAggiudicazione",tipo="Long")
    private long importoAggiudicazione;
	
	@Metadati(nome="aggiudicazione_Link",tipo="String")
    private String aggiudicazione_Link;
	
	@Metadati(nome="aggiudicazioneElOperatori",tipo="String")
    private String aggiudicazioneElOperatori;
	
	@Metadati(nome="aggiudicazioneEsiti",tipo="String")
    private String aggiudicazioneEsiti;
	
	@Metadati(nome="elaboratiDiGaraLink",tipo="String")
    private String elaboratiDiGaraLink;
	
	@Metadati(nome="comunicazioneLink",tipo="String")
    private String comunicazioneLink;
	
	@Metadati(nome="chiarimentiLink",tipo="String")
    private String chiarimentiLink;
	
	@Metadati(nome="numLotto",tipo="Long")
    private long numLotto;
	
	@Metadati(nome="lottoCIG",tipo="String")
    private String lottoCIG;
	
	@Metadati(nome="lottoOggettoCIG",tipo="Long")
    private long lottoOggettoCIG;
	
	@Metadati(nome="importoLotto",tipo="String")
    private String importoLotto;
	
	@Metadati(nome="lottoNpgAttoAutorizzativo",tipo="String")
    private String lottoNpgAttoAutorizzativo;
	
	@Metadati(nome="lottoDataAggiudicazione",tipo="String")
    private String lottoDataAggiudicazione;
	
	@Metadati(nome="lottoAggiudicatario",tipo="String")
    private String lottoAggiudicatario;
	
	@Metadati(nome="lottoPartitaIVA",tipo="String")
    private String lottoPartitaIVA;
	
	
	public GareAppalti(long npgAttoAutorizzativo, long annoPgAutorizzativo, String tipoGara, String titolo, String cig,
			String oggettoAtto, double importoAppalto, String tipoAppalto, String durataContratto, String utilizzoMepa,
			String dataPubblicazioneIperbole, String linkDeterminaPubblica, String oggettoDetermina,
			String settore_Dipartimento, String servizio, String ui, String responsabileProcedimentoGara,
			String responsabileProcedimento, String modalitaDiAggiudicazione, String scadenzaPresentazioneOfferte,
			String oraScadenzaOfferte, String varianteTempiCompletamento_Durata, double importoSommeLiquidate,
			long npgAttoAggiudicazione, long annoPgAggiudicazione, String dataAttoAggiudicazione, String aggiudicatario,
			String partitaIVA, String codiceFiscale, long importoAggiudicazione, String aggiudicazione_Link,
			String aggiudicazioneElOperatori, String aggiudicazioneEsiti, String elaboratiDiGaraLink,
			String comunicazioneLink, String chiarimentiLink, long numLotto, String lottoCIG, long lottoOggettoCIG,
			String importoLotto, String lottoNpgAttoAutorizzativo, String lottoDataAggiudicazione,
			String lottoAggiudicatario, String lottoPartitaIVA) {
		super();
		this.npgAttoAutorizzativo = npgAttoAutorizzativo;
		this.annoPgAutorizzativo = annoPgAutorizzativo;
		this.tipoGara = tipoGara;
		this.titolo = titolo;
		this.cig = cig;
		this.oggettoAtto = oggettoAtto;
		this.importoAppalto = importoAppalto;
		this.tipoAppalto = tipoAppalto;
		this.durataContratto = durataContratto;
		this.utilizzoMepa = utilizzoMepa;
		this.dataPubblicazioneIperbole = dataPubblicazioneIperbole;
		this.linkDeterminaPubblica = linkDeterminaPubblica;
		this.oggettoDetermina = oggettoDetermina;
		this.settore_Dipartimento = settore_Dipartimento;
		this.servizio = servizio;
		this.ui = ui;
		this.responsabileProcedimentoGara = responsabileProcedimentoGara;
		this.responsabileProcedimento = responsabileProcedimento;
		this.modalitaDiAggiudicazione = modalitaDiAggiudicazione;
		this.scadenzaPresentazioneOfferte = scadenzaPresentazioneOfferte;
		this.oraScadenzaOfferte = oraScadenzaOfferte;
		this.varianteTempiCompletamento_Durata = varianteTempiCompletamento_Durata;
		this.importoSommeLiquidate = importoSommeLiquidate;
		this.npgAttoAggiudicazione = npgAttoAggiudicazione;
		this.annoPgAggiudicazione = annoPgAggiudicazione;
		this.dataAttoAggiudicazione = dataAttoAggiudicazione;
		this.aggiudicatario = aggiudicatario;
		this.partitaIVA = partitaIVA;
		this.codiceFiscale = codiceFiscale;
		this.importoAggiudicazione = importoAggiudicazione;
		this.aggiudicazione_Link = aggiudicazione_Link;
		this.aggiudicazioneElOperatori = aggiudicazioneElOperatori;
		this.aggiudicazioneEsiti = aggiudicazioneEsiti;
		this.elaboratiDiGaraLink = elaboratiDiGaraLink;
		this.comunicazioneLink = comunicazioneLink;
		this.chiarimentiLink = chiarimentiLink;
		this.numLotto = numLotto;
		this.lottoCIG = lottoCIG;
		this.lottoOggettoCIG = lottoOggettoCIG;
		this.importoLotto = importoLotto;
		this.lottoNpgAttoAutorizzativo = lottoNpgAttoAutorizzativo;
		this.lottoDataAggiudicazione = lottoDataAggiudicazione;
		this.lottoAggiudicatario = lottoAggiudicatario;
		this.lottoPartitaIVA = lottoPartitaIVA;
	}
	
	
	public long getNpgAttoAutorizzativo() {
		return npgAttoAutorizzativo;
	}
	public void setNpgAttoAutorizzativo(long npgAttoAutorizzativo) {
		this.npgAttoAutorizzativo = npgAttoAutorizzativo;
	}
	public long getAnnoPgAutorizzativo() {
		return annoPgAutorizzativo;
	}
	public void setAnnoPgAutorizzativo(long annoPgAutorizzativo) {
		this.annoPgAutorizzativo = annoPgAutorizzativo;
	}
	public String getTipoGara() {
		return tipoGara;
	}
	public void setTipoGara(String tipoGara) {
		this.tipoGara = tipoGara;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getCig() {
		return cig;
	}
	public void setCig(String cig) {
		this.cig = cig;
	}
	public String getOggettoAtto() {
		return oggettoAtto;
	}
	public void setOggettoAtto(String oggettoAtto) {
		this.oggettoAtto = oggettoAtto;
	}
	public double getImportoAppalto() {
		return importoAppalto;
	}
	public void setImportoAppalto(double importoAppalto) {
		this.importoAppalto = importoAppalto;
	}
	public String getTipoAppalto() {
		return tipoAppalto;
	}
	public void setTipoAppalto(String tipoAppalto) {
		this.tipoAppalto = tipoAppalto;
	}
	public String getDurataContratto() {
		return durataContratto;
	}
	public void setDurataContratto(String durataContratto) {
		this.durataContratto = durataContratto;
	}
	public String getUtilizzoMepa() {
		return utilizzoMepa;
	}
	public void setUtilizzoMepa(String utilizzoMepa) {
		this.utilizzoMepa = utilizzoMepa;
	}
	public String getDataPubblicazioneIperbole() {
		return dataPubblicazioneIperbole;
	}
	public void setDataPubblicazioneIperbole(String dataPubblicazioneIperbole) {
		this.dataPubblicazioneIperbole = dataPubblicazioneIperbole;
	}
	public String getLinkDeterminaPubblica() {
		return linkDeterminaPubblica;
	}
	public void setLinkDeterminaPubblica(String linkDeterminaPubblica) {
		this.linkDeterminaPubblica = linkDeterminaPubblica;
	}
	public String getOggettoDetermina() {
		return oggettoDetermina;
	}
	public void setOggettoDetermina(String oggettoDetermina) {
		this.oggettoDetermina = oggettoDetermina;
	}
	public String getSettore_Dipartimento() {
		return settore_Dipartimento;
	}
	public void setSettore_Dipartimento(String settore_Dipartimento) {
		this.settore_Dipartimento = settore_Dipartimento;
	}
	public String getServizio() {
		return servizio;
	}
	public void setServizio(String servizio) {
		this.servizio = servizio;
	}
	public String getUi() {
		return ui;
	}
	public void setUi(String ui) {
		this.ui = ui;
	}
	public String getResponsabileProcedimentoGara() {
		return responsabileProcedimentoGara;
	}
	public void setResponsabileProcedimentoGara(String responsabileProcedimentoGara) {
		this.responsabileProcedimentoGara = responsabileProcedimentoGara;
	}
	public String getResponsabileProcedimento() {
		return responsabileProcedimento;
	}
	public void setResponsabileProcedimento(String responsabileProcedimento) {
		this.responsabileProcedimento = responsabileProcedimento;
	}
	public String getModalitaDiAggiudicazione() {
		return modalitaDiAggiudicazione;
	}
	public void setModalitaDiAggiudicazione(String modalitaDiAggiudicazione) {
		this.modalitaDiAggiudicazione = modalitaDiAggiudicazione;
	}
	public String getScadenzaPresentazioneOfferte() {
		return scadenzaPresentazioneOfferte;
	}
	public void setScadenzaPresentazioneOfferte(String scadenzaPresentazioneOfferte) {
		this.scadenzaPresentazioneOfferte = scadenzaPresentazioneOfferte;
	}
	public String getOraScadenzaOfferte() {
		return oraScadenzaOfferte;
	}
	public void setOraScadenzaOfferte(String oraScadenzaOfferte) {
		this.oraScadenzaOfferte = oraScadenzaOfferte;
	}
	public String getVarianteTempiCompletamento_Durata() {
		return varianteTempiCompletamento_Durata;
	}
	public void setVarianteTempiCompletamento_Durata(String varianteTempiCompletamento_Durata) {
		this.varianteTempiCompletamento_Durata = varianteTempiCompletamento_Durata;
	}
	public double getImportoSommeLiquidate() {
		return importoSommeLiquidate;
	}
	public void setImportoSommeLiquidate(double importoSommeLiquidate) {
		this.importoSommeLiquidate = importoSommeLiquidate;
	}
	public long getNpgAttoAggiudicazione() {
		return npgAttoAggiudicazione;
	}
	public void setNpgAttoAggiudicazione(long npgAttoAggiudicazione) {
		this.npgAttoAggiudicazione = npgAttoAggiudicazione;
	}
	public long getAnnoPgAggiudicazione() {
		return annoPgAggiudicazione;
	}
	public void setAnnoPgAggiudicazione(long annoPgAggiudicazione) {
		this.annoPgAggiudicazione = annoPgAggiudicazione;
	}
	public String getDataAttoAggiudicazione() {
		return dataAttoAggiudicazione;
	}
	public void setDataAttoAggiudicazione(String dataAttoAggiudicazione) {
		this.dataAttoAggiudicazione = dataAttoAggiudicazione;
	}
	public String getAggiudicatario() {
		return aggiudicatario;
	}
	public void setAggiudicatario(String aggiudicatario) {
		this.aggiudicatario = aggiudicatario;
	}
	public String getPartitaIVA() {
		return partitaIVA;
	}
	public void setPartitaIVA(String partitaIVA) {
		this.partitaIVA = partitaIVA;
	}
	public String getCodiceFiscale() {
		return codiceFiscale;
	}
	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	public long getImportoAggiudicazione() {
		return importoAggiudicazione;
	}
	public void setImportoAggiudicazione(long importoAggiudicazione) {
		this.importoAggiudicazione = importoAggiudicazione;
	}
	public String getAggiudicazione_Link() {
		return aggiudicazione_Link;
	}
	public void setAggiudicazione_Link(String aggiudicazione_Link) {
		this.aggiudicazione_Link = aggiudicazione_Link;
	}
	public String getAggiudicazioneElOperatori() {
		return aggiudicazioneElOperatori;
	}
	public void setAggiudicazioneElOperatori(String aggiudicazioneElOperatori) {
		this.aggiudicazioneElOperatori = aggiudicazioneElOperatori;
	}
	public String getAggiudicazioneEsiti() {
		return aggiudicazioneEsiti;
	}
	public void setAggiudicazioneEsiti(String aggiudicazioneEsiti) {
		this.aggiudicazioneEsiti = aggiudicazioneEsiti;
	}
	public String getElaboratiDiGaraLink() {
		return elaboratiDiGaraLink;
	}
	public void setElaboratiDiGaraLink(String elaboratiDiGaraLink) {
		this.elaboratiDiGaraLink = elaboratiDiGaraLink;
	}
	public String getComunicazioneLink() {
		return comunicazioneLink;
	}
	public void setComunicazioneLink(String comunicazioneLink) {
		this.comunicazioneLink = comunicazioneLink;
	}
	public String getChiarimentiLink() {
		return chiarimentiLink;
	}
	public void setChiarimentiLink(String chiarimentiLink) {
		this.chiarimentiLink = chiarimentiLink;
	}
	public long getNumLotto() {
		return numLotto;
	}
	public void setNumLotto(long numLotto) {
		this.numLotto = numLotto;
	}
	public String getLottoCIG() {
		return lottoCIG;
	}
	public void setLottoCIG(String lottoCIG) {
		this.lottoCIG = lottoCIG;
	}
	public long getLottoOggettoCIG() {
		return lottoOggettoCIG;
	}
	public void setLottoOggettoCIG(long lottoOggettoCIG) {
		this.lottoOggettoCIG = lottoOggettoCIG;
	}
	public String getImportoLotto() {
		return importoLotto;
	}
	public void setImportoLotto(String importoLotto) {
		this.importoLotto = importoLotto;
	}
	public String getLottoNpgAttoAutorizzativo() {
		return lottoNpgAttoAutorizzativo;
	}
	public void setLottoNpgAttoAutorizzativo(String lottoNpgAttoAutorizzativo) {
		this.lottoNpgAttoAutorizzativo = lottoNpgAttoAutorizzativo;
	}
	public String getLottoDataAggiudicazione() {
		return lottoDataAggiudicazione;
	}
	public void setLottoDataAggiudicazione(String lottoDataAggiudicazione) {
		this.lottoDataAggiudicazione = lottoDataAggiudicazione;
	}
	public String getLottoAggiudicatario() {
		return lottoAggiudicatario;
	}
	public void setLottoAggiudicatario(String lottoAggiudicatario) {
		this.lottoAggiudicatario = lottoAggiudicatario;
	}
	public String getLottoPartitaIVA() {
		return lottoPartitaIVA;
	}
	public void setLottoPartitaIVA(String lottoPartitaIVA) {
		this.lottoPartitaIVA = lottoPartitaIVA;
	}
	
	
	@Override
	public String toString() {
		return "GareAppalti [npgAttoAutorizzativo=" + npgAttoAutorizzativo + ", annoPgAutorizzativo="
				+ annoPgAutorizzativo + ", tipoGara=" + tipoGara + ", titolo=" + titolo + ", cig=" + cig
				+ ", oggettoAtto=" + oggettoAtto + ", importoAppalto=" + importoAppalto + ", tipoAppalto=" + tipoAppalto
				+ ", durataContratto=" + durataContratto + ", utilizzoMepa=" + utilizzoMepa
				+ ", dataPubblicazioneIperbole=" + dataPubblicazioneIperbole + ", linkDeterminaPubblica="
				+ linkDeterminaPubblica + ", oggettoDetermina=" + oggettoDetermina + ", settore_Dipartimento="
				+ settore_Dipartimento + ", servizio=" + servizio + ", ui=" + ui + ", responsabileProcedimentoGara="
				+ responsabileProcedimentoGara + ", responsabileProcedimento=" + responsabileProcedimento
				+ ", modalitàDiAggiudicazione=" + modalitaDiAggiudicazione + ", scadenzaPresentazioneOfferte="
				+ scadenzaPresentazioneOfferte + ", oraScadenzaOfferte=" + oraScadenzaOfferte
				+ ", varianteTempiCompletamento_Durata=" + varianteTempiCompletamento_Durata
				+ ", importoSommeLiquidate=" + importoSommeLiquidate + ", npgAttoAggiudicazione="
				+ npgAttoAggiudicazione + ", annoPgAggiudicazione=" + annoPgAggiudicazione + ", dataAttoAggiudicazione="
				+ dataAttoAggiudicazione + ", aggiudicatario=" + aggiudicatario + ", partitaIVA=" + partitaIVA
				+ ", codiceFiscale=" + codiceFiscale + ", importoAggiudicazione=" + importoAggiudicazione
				+ ", aggiudicazione_Link=" + aggiudicazione_Link + ", aggiudicazioneElOperatori="
				+ aggiudicazioneElOperatori + ", aggiudicazioneEsiti=" + aggiudicazioneEsiti + ", elaboratiDiGaraLink="
				+ elaboratiDiGaraLink + ", comunicazioneLink=" + comunicazioneLink + ", chiarimentiLink="
				+ chiarimentiLink + ", numLotto=" + numLotto + ", lottoCIG=" + lottoCIG + ", lottoOggettoCIG="
				+ lottoOggettoCIG + ", importoLotto=" + importoLotto + ", lottoNpgAttoAutorizzativo="
				+ lottoNpgAttoAutorizzativo + ", lottoDataAggiudicazione=" + lottoDataAggiudicazione
				+ ", lottoAggiudicatario=" + lottoAggiudicatario + ", lottoPartitaIVA=" + lottoPartitaIVA + "]";
	}
	
	
	
		
}
