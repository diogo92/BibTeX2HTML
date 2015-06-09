<#list MastersthesisList as MastersthesisData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${MastersthesisData.citationKey}</li>
			<li>${MastersthesisData.author}.
				(${MastersthesisData.year}<#if MastersthesisData.month??>, ${MastersthesisData.month}</#if>).
				<#if MastersthesisData.type??>${MastersthesisData.type}.</#if>
				"${MastersthesisData.title}".
				${MastersthesisData.school}.
				<#if MastersthesisData.address??>${MastersthesisData.address}.</#if>
				<#if MastersthesisData.note??>(${MastersthesisData.note}).</#if>
				<#if MastersthesisData.key??>${MastersthesisData.key}.</#if>
				<#if MastersthesisData.crossref??>${MastersthesisData.crossref}</#if>
			</li>
		</ul>
	</div>
</#list>