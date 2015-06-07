s<#list ProceedingsList as ProceedingsData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${ProceedingsData.citationKey}</li>
			<li>${ProceedingsData.year}
				<#if ProceedingsData.month??>, ${ProceedingsData.month}</#if>.
				${ProceedingsData.title}.
				<#if ProceedingsData.volume??> ${ProceedingsData.volume}.</#if>
				<#if ProceedingsData.address??> ${ProceedingsData.address}:</#if>
				<#if ProceedingsData.publisher??> ${ProceedingsData.publisher}.</#if>
				<#if ProceedingsData.editor??> ${ProceedingsData.editor}.</#if>
				<#if ProceedingsData.series??> ${ProceedingsData.series}.</#if>
				<#if ProceedingsData.organization??> ${ProceedingsData.organization}.</#if>
				<#if ProceedingsData.note??> ${ProceedingsData.note}.</#if>
				<#if ProceedingsData.key??> ${ProceedingsData.key}.</#if>
				<#if ProceedingsData.crossref??> ${ProceedingsData.crossref}.</#if>
			</li>
		</ul>
	</div>
</#list>