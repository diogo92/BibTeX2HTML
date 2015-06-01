<#list PhdthesisList as PhdthesisData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${PhdthesisData.citationKey}</li>
			<li><strong>Author:</strong> ${PhdthesisData.author}</li>
			<li><strong>Title:</strong> ${PhdthesisData.title}</li>
			<li><strong>School:</strong> ${PhdthesisData.school}</li>
			<li><strong>Year:</strong> ${PhdthesisData.year}</li>
			<#if PhdthesisData.type??>
				<li><strong>Type:</strong> ${PhdthesisData.type}</li>
			</#if>
			<#if PhdthesisData.address??>
				<li><strong>Address:</strong> ${PhdthesisData.address}</li>
			</#if>
			<#if PhdthesisData.month??>
				<li><strong>Month:</strong> ${PhdthesisData.month}</li>
			</#if>
			<#if PhdthesisData.note??>
				<li><strong>Note:</strong> ${PhdthesisData.note}</li>
			</#if>
			<#if PhdthesisData.key??>
				<li><strong>Key:</strong> ${PhdthesisData.key}</li>
			</#if>
			<#if PhdthesisData.crossref??>
				<li><strong>Crossref:</strong> ${PhdthesisData.crossref}</li>
			</#if>
		</ul>
	</div>
</#list>