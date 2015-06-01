<#list ConferenceList as ConferenceData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${ConferenceData.citationKey}</li>
			<li>${ConferenceData.author} 
				(${ConferenceData.year}
				<#if ConferenceData.month??>
				,${ConferenceData.month}
				</#if>). 
				<i>${ConferenceData.booktitle} </i>
				${ConferenceData.title}
			
			<#if ConferenceData.volume??>
				,vol. ${ConferenceData.volume}
			</#if>
			<#if ConferenceData.pages??>
				,p. ${ConferenceData.pages}
			</#if>
			<#if ConferenceData.address??>
				,${ConferenceData.address}
			</#if>
			<#if ConferenceData.publisher??>
				,${ConferenceData.publisher}
			</#if>			
			
			<#if ConferenceData.editor??>
				,${ConferenceData.editor}
			</#if>
			<#if ConferenceData.number??>
				,${ConferenceData.number}
			</#if>
			<#if ConferenceData.series??>
				,${ConferenceData.series} series
			</#if>
			
			<#if ConferenceData.organization??>
				,${ConferenceData.organization}
			</#if>
			
			<#if ConferenceData.note??>
				,${ConferenceData.note}
			</#if>
			<#if ConferenceData.key??>
				,${ConferenceData.key}
			</#if>
			<#if ConferenceData.crossref??>
				,${ConferenceData.crossref}
			</#if></li>
		</ul>
	</div>
</#list>