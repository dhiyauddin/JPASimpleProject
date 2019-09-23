package com.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;


/**
 * The persistent class for the flightinfo database table.
 * 
 */
@Entity
@NamedQuery(name="Flightinfo.findAll", query="SELECT f FROM Flightinfo f")
public class Flightinfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idNo;

	private String flightNo;

	private Time jangkaanMasaKetibaan;

	private String lapanganKetibaan;

	private Time masaBerlepas;

	private Time masaLaporDiri;

	private String noKt;

	@Temporal(TemporalType.DATE)
	private Date tarikhBerlepas;

	@Temporal(TemporalType.DATE)
	private Date tarikhKetibaan;

	@Temporal(TemporalType.DATE)
	private Date tarikhLaporDiri;

	private String tempatBerlepas;

	public Flightinfo() {
	}

	public int getIdNo() {
		return this.idNo;
	}

	public void setIdNo(int idNo) {
		this.idNo = idNo;
	}

	public String getFlightNo() {
		return this.flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public Time getJangkaanMasaKetibaan() {
		return this.jangkaanMasaKetibaan;
	}

	public void setJangkaanMasaKetibaan(Time jangkaanMasaKetibaan) {
		this.jangkaanMasaKetibaan = jangkaanMasaKetibaan;
	}

	public String getLapanganKetibaan() {
		return this.lapanganKetibaan;
	}

	public void setLapanganKetibaan(String lapanganKetibaan) {
		this.lapanganKetibaan = lapanganKetibaan;
	}

	public Time getMasaBerlepas() {
		return this.masaBerlepas;
	}

	public void setMasaBerlepas(Time masaBerlepas) {
		this.masaBerlepas = masaBerlepas;
	}

	public Time getMasaLaporDiri() {
		return this.masaLaporDiri;
	}

	public void setMasaLaporDiri(Time masaLaporDiri) {
		this.masaLaporDiri = masaLaporDiri;
	}

	public String getNoKt() {
		return this.noKt;
	}

	public void setNoKt(String noKt) {
		this.noKt = noKt;
	}

	public Date getTarikhBerlepas() {
		return this.tarikhBerlepas;
	}

	public void setTarikhBerlepas(Date tarikhBerlepas) {
		this.tarikhBerlepas = tarikhBerlepas;
	}

	public Date getTarikhKetibaan() {
		return this.tarikhKetibaan;
	}

	public void setTarikhKetibaan(Date tarikhKetibaan) {
		this.tarikhKetibaan = tarikhKetibaan;
	}

	public Date getTarikhLaporDiri() {
		return this.tarikhLaporDiri;
	}

	public void setTarikhLaporDiri(Date tarikhLaporDiri) {
		this.tarikhLaporDiri = tarikhLaporDiri;
	}

	public String getTempatBerlepas() {
		return this.tempatBerlepas;
	}

	public void setTempatBerlepas(String tempatBerlepas) {
		this.tempatBerlepas = tempatBerlepas;
	}

}