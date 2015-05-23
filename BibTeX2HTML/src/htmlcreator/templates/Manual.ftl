<#list ManualList as ManualData>
	<div>
		<ul>
			<li><strong>Key:</strong> ${ManualData.citationKey}</li>
			<li><strong>Title:</strong> ${ManualData.title}</li>
			<#if ManualData.author??>
				<li><strong>Author:</strong> ${ManualData.author}</li>
			</#if>
			<#if ManualData.organization??>
				<li><strong>Organization:</strong> ${ManualData.organization}</li>
			</#if>
			<#if ManualData.address??>
				<li><strong>Address:</strong> ${ManualData.address}</li>
			</#if>
			<#if ManualData.edition??>
				<li><strong>Edition:</strong> ${ManualData.edition}</li>
			</#if>
			<#if ManualData.month??>
				<li><strong>Month:</strong> ${ManualData.month}</li>
			</#if>
			<#if ManualData.year??>
				<li><strong>Year:</strong> ${ManualData.year}</li>
			</#if>
			<#if ManualData.note??>
				<li><strong>Note:</strong> ${ManualData.note}</li>
			</#if>
			<#if ManualData.key??>
				<li><strong>Key:</strong> ${ManualData.key}</li>
			</#if>
			<#if ManualData.crossref??>
				<li><strong>Crossref:</strong> ${ManualData.crossref}</li>
			</#if>
		</ul>
	</div>
</#list>