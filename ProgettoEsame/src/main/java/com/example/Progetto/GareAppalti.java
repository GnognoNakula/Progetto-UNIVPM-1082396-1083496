package com.example.Progetto;

public class GareAppalti {
    private long npgAttoAutorizzativo;
    private long annoPgAutorizzativo;
    private String tipoGara;
    private String titolo;
    private String cig;
    private String oggettoAtto;
    private String importoAppalto;
    private String tipoAppalto;
    private String durataContratto;
    private String utilizzoMepa;
    private String dataPubblicazioneIperbole;
    private String linkDeterminaPubblica;
    private String oggettoDetermina;
    private String settore_Dipartimento;
    private String servizio;
    private String ui;
    private String responsabileProcedimentoGara;
    private String responsabileProcedimento;
    private String modalitàDiAggiudicazione;
    private String scadenzaPresentazioneOfferte;
    private String oraScadenzaOfferte;
    private String varianteTempiCompletamento_Durata;
    private double importoSommeLiquidate;
    private long npgAttoAggiudicazione;
    private long annoPgAggiudicazione;
    private String dataAttoAggiudicazione;
    private String aggiudicatario;
    private String partitaIVA;
    private String codiceFiscale;
    private long importoAggiudicazione;
    private String aggiudicazione_Link;
    private String aggiudicazioneElOperatori;
    private String aggiudicazioneEsiti;
    private String elaboratiDiGaraLink;
    private String comunicazioneLink;
    private String chiarimentiLink;
    private long numLotto;
    private String lottoCIG;
    private long lottoOggettoCIG;
    private String importoLotto;
    private String lottoNpgAttoAutorizzativo;
    private String lottoDataAggiudicazione;
    private String lottoAggiudicatario;
    private String lottoPartitaIVA;
	public GareAppalti(long npgAttoAutorizzativo, long annoPgAutorizzativo, String tipoGara, String titolo, String cig,
			String oggettoAtto, String importoAppalto, String tipoAppalto, String durataContratto, String utilizzoMepa,
			String dataPubblicazioneIperbole, String linkDeterminaPubblica, String oggettoDetermina,
			String settore_Dipartimento, String servizio, String ui, String responsabileProcedimentoGara,
			String responsabileProcedimento, String modalitàDiAggiudicazione, String scadenzaPresentazioneOfferte,
			String oraScadenzaOfferte, String varianteTempiCompletamento_Durata, double importoSommeLiquidate,
			long npgAttoAggiudicazione, long annoPgAggiudicazione, String dataAttoAggiudicazione, String aggiudicatario,
			String partitaIVA, String codiceFiscale, long importoAggiudicazione, String aggiudicazione_Link,
			String aggiudicazioneElOperatori, String aggiudicazioneEsiti, String elaboratiDiGaraLink,
			String comunicazioneLink, String chiarimentiLink, long numLotto, String lottoCIG, long lottoOggettoCIG,
			String importoLotto, String lottoNpgAttoAutorizzativo, String lottoDataAggiudicazione,
			String lottoAggiudicatario, String lottoPartitaIVA) {
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
		this.modalitàDiAggiudicazione = modalitàDiAggiudicazione;
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
	public String getImportoAppalto() {
		return importoAppalto;
	}
	public void setImportoAppalto(String importoAppalto) {
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
	public String getModalitàDiAggiudicazione() {
		return modalitàDiAggiudicazione;
	}
	public void setModalitàDiAggiudicazione(String modalitàDiAggiudicazione) {
		this.modalitàDiAggiudicazione = modalitàDiAggiudicazione;
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
				+ ", modalitàDiAggiudicazione=" + modalitàDiAggiudicazione + ", scadenzaPresentazioneOfferte="
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
