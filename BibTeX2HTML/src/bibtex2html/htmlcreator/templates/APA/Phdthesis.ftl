<#list PhdthesisList as PhdthesisData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${PhdthesisData.citationKey}</li>
			<li>${PhdthesisData.author}
				(${PhdthesisData.year}
					<#if PhdthesisData.month??>,${PhdthesisData.month}</#if>
				).
				<i>${PhdthesisData.title}</i>.
				${PhdthesisData.school}
				<#if PhdthesisData.address??>,${PhdthesisData.address}.</#if>
				<#if PhdthesisData.type??> ${PhdthesisData.type}.</#if>
				<#if PhdthesisData.note??> ${PhdthesisData.note}.</#if>
				<#if PhdthesisData.key??> ${PhdthesisData.key}.</#if>
				<#if PhdthesisData.crossref??> ${PhdthesisData.crossref}</#if></li>
		</ul>
	</div>
</#list>