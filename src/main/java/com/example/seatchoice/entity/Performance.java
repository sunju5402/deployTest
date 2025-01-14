package com.example.seatchoice.entity;

import com.example.seatchoice.entity.common.BaseEntity;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Performance extends BaseEntity {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "theater_id")
	private Theater theater;

	@NotNull
	private String mt20id;

	@NotNull
	private String prfnm;

	private String poster;

	@NotNull
	private String genrenm;

	@NotNull
	private boolean openrun;

	@NotNull
	private LocalDate prfpdfrom;

	@NotNull
	private LocalDate prfpdto;
}
