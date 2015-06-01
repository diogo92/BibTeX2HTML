<#list UnpublishedList as UnpublishedData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${UnpublishedData.citationKey}</li>
			<li><strong>Author:</strong> ${UnpublishedData.author}</li>
			<li><strong>Title:</strong> ${UnpublishedData.title}</li>
			<li><strong>Note:</strong> ${UnpublishedData.note}</li>
			<#if UnpublishedData.month??>
				<li><strong>Month:</strong> ${UnpublishedData.month}</li>
			</#if>
			<#if UnpublishedData.year??>
				<li><strong>Year:</strong> ${UnpublishedData.year}</li>
			</#if>
			<#if UnpublishedData.key??>
				<li><strong>Key:</strong> ${UnpublishedData.key}</li>
			</#if>
			<#if UnpublishedData.crossref??>
				<li><strong>Crossref:</strong> ${UnpublishedData.crossref}</li>
			</#if>
		</ul>
	</div>
</#list>