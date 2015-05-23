<#list MastersthesisList as MastersthesisData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${MastersthesisData.citationKey}</li>
			<li><strong>Author:</strong> ${MastersthesisData.author}</li>
			<li><strong>Title:</strong> ${MastersthesisData.title}</li>
			<li><strong>School:</strong> ${MastersthesisData.school}</li>
			<li><strong>Year:</strong> ${MastersthesisData.year}</li>
			<#if MastersthesisData.type??>
				<li><strong>Type:</strong> ${MastersthesisData.type}</li>
			</#if>
			<#if MastersthesisData.address??>
				<li><strong>Address:</strong> ${MastersthesisData.address}</li>
			</#if>
			<#if MastersthesisData.month??>
				<li><strong>Month:</strong> ${MastersthesisData.month}</li>
			</#if>
			<#if MastersthesisData.note??>
				<li><strong>Note:</strong> ${MastersthesisData.note}</li>
			</#if>
			<#if MastersthesisData.key??>
				<li><strong>Key:</strong> ${MastersthesisData.key}</li>
			</#if>
			<#if MastersthesisData.crossref??>
				<li><strong>Crossref:</strong> ${MastersthesisData.crossref}</li>
			</#if>
		</ul>
	</div>
</#list>