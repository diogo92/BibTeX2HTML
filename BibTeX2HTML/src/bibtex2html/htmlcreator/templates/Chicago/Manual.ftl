<#list ManualList as ManualData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${ManualData.citationKey}</li>
			<li>
				<#if ManualData.author??>${ManualData.author}.</#if>
				<#if ManualData.year??>(${ManualData.year}<#if ManualData.month??>
				, ${ManualData.month}</#if>).</#if>
				"${ManualData.title}".
				<#if ManualData.edition??>${ManualData.edition} ed.</#if>
				<#if ManualData.organization??>${ManualData.organization}.</#if>
				<#if ManualData.address??>${ManualData.address}.</#if>
				<#if ManualData.note??>(${ManualData.note}).</#if>
				<#if ManualData.key??>${ManualData.key}.</#if>
				<#if ManualData.crossref??>${ManualData.crossref}.</#if>
			</li>
		</ul>
	</div>
</#list>