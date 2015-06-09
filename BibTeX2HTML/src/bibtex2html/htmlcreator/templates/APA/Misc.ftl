<#list MiscList as MiscData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${MiscData.citationKey}</li>
			<li><#if MiscData.author??>${MiscData.author}.</#if>
				<#if MiscData.year??>(${MiscData.year}<#if MiscData.month??>, ${MiscData.month}</#if>).</#if>
				<#if MiscData.title??><i>${MiscData.title}.</i></#if>
				<#if MiscData.note??>${MiscData.note}.</#if>
				<#if MiscData.note??>${MiscData.note}.</#if>
				<#if MiscData.key??>${MiscData.key}.</#if>
				<#if MiscData.crossref??>${MiscData.crossref}.</#if>
			</li>
		</ul>
	</div>
</#list>