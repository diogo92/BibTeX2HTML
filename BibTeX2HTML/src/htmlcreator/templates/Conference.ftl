<#list ConferenceList as ConferenceData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${ConferenceData.citationKey}</li>
			<li><strong>Author:</strong> ${ConferenceData.author}</li>
			<li><strong>Title:</strong> ${ConferenceData.title}</li>
			<li><strong>Book Title:</strong> ${ConferenceData.booktitle}</li>
			<li><strong>Year:</strong> ${ConferenceData.year}</li>
			<#if ConferenceData.editor??>
				<li><strong>Editor:</strong> ${ConferenceData.editor}</li>
			</#if>
			<#if ConferenceData.volume??>
				<li><strong>Volume:</strong> ${ConferenceData.volume}</li>
			</#if>
			<#if ConferenceData.number??>
				<li><strong>Number:</strong> ${ConferenceData.number}</li>
			</#if>
			<#if ConferenceData.series??>
				<li><strong>Series:</strong> ${ConferenceData.series}</li>
			</#if>
			<#if ConferenceData.pages??>
				<li><strong>Pages:</strong> ${ConferenceData.pages}</li>
			</#if>
			<#if ConferenceData.address??>
				<li><strong>Address:</strong> ${ConferenceData.address}</li>
			</#if>
			<#if ConferenceData.month??>
				<li><strong>Month:</strong> ${ConferenceData.month}</li>
			</#if>
			<#if ConferenceData.organization??>
				<li><strong>Organization:</strong> ${ConferenceData.organization}</li>
			</#if>
			<#if ConferenceData.publisher??>
				<li><strong>Publisher:</strong> ${ConferenceData.publisher}</li>
			</#if>
			<#if ConferenceData.note??>
				<li><strong>Note:</strong> ${ConferenceData.note}</li>
			</#if>
			<#if ConferenceData.key??>
				<li><strong>Key:</strong> ${ConferenceData.key}</li>
			</#if>
			<#if ConferenceData.crossref??>
				<li><strong>Crossref:</strong> ${ConferenceData.crossref}</li>
			</#if>
		</ul>
	</div>
</#list>