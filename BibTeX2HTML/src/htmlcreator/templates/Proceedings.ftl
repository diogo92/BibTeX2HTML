<#list ProceedingsList as ProceedingsData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${ProceedingsData.citationKey}</li>
			<li><strong>Title:</strong> ${ProceedingsData.title}</li>
			<li><strong>Year:</strong> ${ProceedingsData.year}</li>
			<#if ProceedingsData.editor??>
				<li><strong>Editor:</strong> ${ProceedingsData.editor}</li>
			</#if>
			<#if ProceedingsData.volume??>
				<li><strong>Volume:</strong> ${ProceedingsData.volume}</li>
			</#if>
			<#if ProceedingsData.series??>
				<li><strong>Series:</strong> ${ProceedingsData.series}</li>
			</#if>
			<#if ProceedingsData.address??>
				<li><strong>Address:</strong> ${ProceedingsData.address}</li>
			</#if>
			<#if ProceedingsData.month??>
				<li><strong>Month:</strong> ${ProceedingsData.month}</li>
			</#if>
			<#if ProceedingsData.organization??>
				<li><strong>Organization:</strong> ${ProceedingsData.organization}</li>
			</#if>
			<#if ProceedingsData.publisher??>
				<li><strong>Publisher:</strong> ${ProceedingsData.publisher}</li>
			</#if>
			<#if ProceedingsData.note??>
				<li><strong>Note:</strong> ${ProceedingsData.note}</li>
			</#if>
			<#if ProceedingsData.key??>
				<li><strong>Key:</strong> ${ProceedingsData.key}</li>
			</#if>
		</ul>
	</div>
</#list>